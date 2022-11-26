package com.t.zero.rpc.user.api.service;

import com.t.zero.rpc.user.api.bean.UserInfo;

import java.util.List;

public interface UserInfoRpcService {

     List<UserInfo> getUserInfos(List<Integer> userIds);

     List<UserInfo> getRelUserGroups(List<Integer> groupIds);

     List<Integer> getRelRroupByUser(Integer userId);

     UserInfo getById(Integer userId);

     String g(Integer t, String u);

     String[] g(Integer t, String[] u);

}
