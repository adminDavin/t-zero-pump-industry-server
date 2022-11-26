package com.t.zero.rpc.user.api.service;

/**
 * @author davinzhang
 * 
 * @date 2021/12/06
 * 
 * @desc TODO
 */

public interface ConsumingSecretRpcService {

    /**
     * 扣减密钥
     * 
     * @param t 租户ID
     * @param u 用户ID
     * @param g 用户所在组
     * @param sc 密钥
     * @param ak 
     * 
     * @return
     */
    String ds(Integer t, Integer u, Integer g, String sc, String ak);

}
