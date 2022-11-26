package com.t.zero.u.c.r.service;

/**
 * @author davinzhang
 * @date 2021/11/03
 * @desc 用户相关rpc接口定义
 */

public interface UserRelatedRpcService {

    /**
     * 获取用户相关的组列表
     */
    String g(Integer t, Integer[] u);

    /**
     * 获取用户相关的组列表
     */
    String[] g(Integer t, Integer u);

}
