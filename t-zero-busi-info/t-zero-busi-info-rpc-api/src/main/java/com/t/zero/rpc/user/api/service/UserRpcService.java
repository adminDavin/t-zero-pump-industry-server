package com.t.zero.rpc.user.api.service;

/**
 * @author davinzhang
 * 
 * @date 2021/11/18
 * 
 * @desc TODO
 */

public interface UserRpcService {

    /**
     * 获取简单的用户列表
     * 
     * @param t 租户ID
     * @param us 用户ID列表
     */
    public String[] su(Integer t, Integer[] us);
}
