package com.t.zero.message.platform.controller.impl;

import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;
import com.t.zero.message.platform.controller.MessageSceneController;
import com.t.zero.message.platform.model.auto.MessageScene;
import com.t.zero.message.platform.service.MessageSceneService;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;
import org.springframework.web.bind.annotation.RestController;

import static com.t.zero.message.platform.constant.TMessageConstant.LISTDEFAULT;
import static com.t.zero.message.platform.constant.TMessageConstant.FORBITCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.FOLLOWCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.ENABLECHANNEL;
import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.*;

import static com.t.zero.message.platform.constant.TMessageConstant.INITMESSAGEDATE;
import static com.t.zero.message.platform.constant.TMessageConstant.ENABLESCENE;
import static com.t.zero.message.platform.constant.TMessageConstant.FORBITSCENE;


@RestController
public class MessageSceneControllerImpl extends TZeroBasicController implements MessageSceneController {

    public MessageSceneControllerImpl(ResponseExceptionHandler responseExceptionHandler, MessageSceneService messageSceneService) {
        super(responseExceptionHandler);
        this.messageSceneService = messageSceneService;
    }

    private final String MESSAGE_SCENE_CONTROLLER_IMPL = "MESSAGE_SCENE_CONTROLLER_IMPL.%s failed";
    private final MessageSceneService messageSceneService;

    @Override
    public ResponseResult<Object> list(Integer tenantId, Integer userId, MessageInstanceFilters filters, Integer currentPage, Integer pageSize) {
        try {
            return ResponseResult.ok(messageSceneService.list(CommonParams.build(tenantId, userId), filters, currentPage, pageSize));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, LIST), e);
        }
    }

    @Override
    public ResponseResult<Object> save(Integer tenantId, Integer userId, MessageScene messageScene) {
        try {
            return ResponseResult.ok(messageSceneService.save(CommonParams.build(tenantId, userId), messageScene));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, SAVE), e);
        }
    }

    @Override
    public ResponseResult<Object> modify(Integer tenantId, Integer userId, MessageScene messageScene) {
        try {
            return ResponseResult.ok(messageSceneService.modify(CommonParams.build(tenantId, userId), messageScene));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, MODIFY), e);
        }
    }

    @Override
    public ResponseResult<Object> delete(Integer tenantId, Integer userId, Integer sceneId) {
        try {
            return ResponseResult.ok(messageSceneService.delete(CommonParams.build(tenantId, userId), sceneId));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, DELETE), e);
        }
    }

    @Override
    public ResponseResult<Object> forbitScene(Integer tenantId, Integer userId, Integer sceneId) {
        try {
            return ResponseResult.ok(messageSceneService.forbitScene(CommonParams.build(tenantId, userId), sceneId));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, FORBITSCENE), e);
        }
    }

    @Override
    public ResponseResult<Object> enableScene(Integer tenantId, Integer userId, Integer sceneId) {
        try {
            return ResponseResult.ok(messageSceneService.enableScene(CommonParams.build(tenantId, userId), sceneId));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, ENABLESCENE), e);
        }
    }

    /*
     *功能描述：初始化消息场景、消息模版和消息渠道
     * @author mjy
     * @date 2021/9/3 3:24 下午
     */
    @Override
    public ResponseResult<Object> initMessageDate(Integer tenantId, Integer userId) {
        try {
            return ResponseResult.ok(messageSceneService.initMessageDate(CommonParams.build(tenantId, userId)));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_SCENE_CONTROLLER_IMPL, INITMESSAGEDATE), e);
        }
    }

}
