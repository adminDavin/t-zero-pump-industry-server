package com.t.zero.rpc.user.api.service;

import com.t.zero.rpc.user.api.bean.GroupDefined;
import com.t.zero.rpc.user.api.bean.GroupDefinedVo;

import java.util.List;

public interface GroupRpcService {

    public List<GroupDefined> getGroups(List<Integer> groupIds);

    public GroupDefined getGroupById(Integer groupId);

    public List<GroupDefined> selectSons(String pid);

    public List<GroupDefinedVo> getGroupByUserId(Integer userId, Integer tendId);

    public List<GroupDefined> getMyGroup(Integer userIdInt);

    /**
     * 获取简单群组列表
     * 
     * @param t 租户ID
     * @param gs 群组ID列表
     * 
     * @return 简单的群组列表
     */
    public String[] sg(Integer t, Integer[] gs);
}
