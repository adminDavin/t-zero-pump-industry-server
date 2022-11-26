package com.t.zero.message.platform.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.t.zero.message.platform.service.ChannelDefinedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.dao.auto.MessageSceneMapper;
import com.t.zero.message.platform.dao.auto.RelUserMessageSceneMapper;
import com.t.zero.message.platform.model.auto.MessageScene;
import com.t.zero.message.platform.model.auto.MessageSceneExample;
import com.t.zero.message.platform.model.auto.RelUserMessageScene;
import com.t.zero.message.platform.model.auto.RelUserMessageSceneExample;
import com.t.zero.message.platform.service.MessageSceneService;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;

@Service
public class MessageSceneServiceImpl implements MessageSceneService {

    @Autowired
    private MessageSceneMapper messageSceneMapper;
    
    @Autowired
    private RelUserMessageSceneMapper relUserMessageSceneMapper;
    @Autowired
    private ChannelDefinedService channelDefinedService;



    @Override
    public List<MessageScene> list(CommonParams params, MessageInstanceFilters filters, Integer currentPage, Integer pageSize) {
        var messageSceneExample = new MessageSceneExample();
        messageSceneExample.createCriteria().andTenantIdEqualTo(params.getTenantId())
            .andDeletedFlagEqualTo(TZeroConstants.NORMAL);
        var relUserMessageSceneExample = new RelUserMessageSceneExample();
        relUserMessageSceneExample.createCriteria().andUserIdEqualTo(params.getUserIdInt());
        List<RelUserMessageScene> relUserMessageScenes = relUserMessageSceneMapper.selectByExample(relUserMessageSceneExample);
        var relUserMessageSceneMap = relUserMessageScenes.stream().collect(Collectors.toMap(RelUserMessageScene::getSceneId, RelUserMessageScene::getRelStatus));
        var results = messageSceneMapper.selectByExample(messageSceneExample);
        for (var result: results) {
            result.setSceneStatus(relUserMessageSceneMap.getOrDefault(result.getId(), result.getSceneStatus()));
        }
        return results;
    }


    @Override
    public Integer save(CommonParams params, MessageScene messageScene) {
        var operateTime = LocalDateTime.now();
        messageScene.setCreatedTime(operateTime);
        messageScene.setUpdatedTime(operateTime);
        messageScene.setCreatedUserId(params.getUserId());
        messageScene.setUpdatedUserId(params.getUserId());
        messageScene.setDeletedFlag(TZeroConstants.NORMAL);
        messageScene.setSceneStatus(TZeroConstants.STATUS_NORMAL);
        messageScene.setTenantId(params.getTenantId());
        return messageSceneMapper.insert(messageScene);
    }

    @Override
    public Integer modify(CommonParams params, MessageScene messageScene) {
        var operateTime = LocalDateTime.now();
        messageScene.setUpdatedTime(operateTime);
        messageScene.setUpdatedUserId(params.getUserId());
        messageScene.setSceneStatus(TZeroConstants.STATUS_NORMAL);
        return messageSceneMapper.updateByPrimaryKeySelective(messageScene);
    }

    @Override
    public Integer forbitScene(CommonParams params, Integer sceneId) {
        var relUserMessageSceneExample = new RelUserMessageSceneExample();
        relUserMessageSceneExample.createCriteria().andUserIdEqualTo(params.getUserIdInt()).andSceneIdEqualTo(sceneId);
        var userScenes = relUserMessageSceneMapper.selectByExample(relUserMessageSceneExample);
        if (ObjectUtils.isEmpty(userScenes)) {
            var messageScene = messageSceneMapper.selectByPrimaryKey(sceneId);
            RelUserMessageScene relUserMessageScene = new RelUserMessageScene();
            var operateTime = LocalDateTime.now();
            relUserMessageScene.setCreatedTime(operateTime);
            relUserMessageScene.setCreatedUserId(params.getUserId());
            relUserMessageScene.setRelStatus(TZeroConstants.STATUS_ABNORMAL);
            relUserMessageScene.setSceneCode(messageScene.getSceneCode());
            relUserMessageScene.setSceneId(messageScene.getId());
            relUserMessageScene.setUserId(params.getUserIdInt());
            relUserMessageSceneMapper.insert(relUserMessageScene);
        } else {
            var userScene = userScenes.get(0);
            userScene.setRelStatus(TZeroConstants.STATUS_ABNORMAL);
            userScene.setCreatedTime(LocalDateTime.now());
            userScene.setCreatedUserId(params.getUserId());
            relUserMessageSceneMapper.updateByPrimaryKeySelective(userScene);
        }
        return 1;
    }

    @Override
    public Integer enableScene(CommonParams params, Integer sceneId) {
        var relUserMessageSceneExample = new RelUserMessageSceneExample();
        relUserMessageSceneExample.createCriteria().andUserIdEqualTo(params.getUserIdInt()).andSceneIdEqualTo(sceneId);
        var userScenes = relUserMessageSceneMapper.selectByExample(relUserMessageSceneExample);
        if (ObjectUtils.isEmpty(userScenes)) {
            var messageScene = messageSceneMapper.selectByPrimaryKey(sceneId);
            RelUserMessageScene relUserMessageScene = new RelUserMessageScene();
            var operateTime = LocalDateTime.now();
            relUserMessageScene.setCreatedTime(operateTime);
            relUserMessageScene.setCreatedUserId(params.getUserId());
            relUserMessageScene.setRelStatus(TZeroConstants.STATUS_NORMAL);
            relUserMessageScene.setSceneCode(messageScene.getSceneCode());
            relUserMessageScene.setSceneId(messageScene.getId());
            relUserMessageScene.setUserId(params.getUserIdInt());
            relUserMessageSceneMapper.insert(relUserMessageScene);
        } else {
            var userScene = userScenes.get(0);
            userScene.setRelStatus(TZeroConstants.STATUS_NORMAL);
            userScene.setCreatedTime(LocalDateTime.now());
            userScene.setCreatedUserId(params.getUserId());
            relUserMessageSceneMapper.updateByPrimaryKeySelective(userScene);
        }
        return 1;
    }

    @Override
    public Integer delete(CommonParams params, Integer sceneId) {
        return messageSceneMapper.deleteByPrimaryKey(sceneId);
    }
    /*
     *功能描述：初始化消息场景、消息模版和消息渠道
     * @author mjy
     * @date 2021/9/3 3:24 下午
     */
    @Override
    @Transactional
    public Boolean initMessageDate(CommonParams params) {
        Integer tendId = TZeroConstants.ININT_TENANT;
        //初始化消息场景
        MessageSceneExample messageSceneExample = new MessageSceneExample();
        messageSceneExample.createCriteria().andTenantIdEqualTo(tendId).andDeletedFlagEqualTo(TZeroConstants.NORMAL);
        List<MessageScene> messageScenes = messageSceneMapper.selectByExample(messageSceneExample);
        messageScenes.stream().forEach(item->{
            item.setTenantId(params.getTenantId());
            var operateTime = LocalDateTime.now();
            item.setId(null);
            item.setCreatedTime(operateTime);
            item.setUpdatedTime(operateTime);
            item.setCreatedUserId(params.getUserId());
            item.setUpdatedUserId(params.getUserId());
            messageSceneMapper.insert(item);
        });
        //初始化渠道
        channelDefinedService.initDate(tendId,params);



        return true;
    }

}
