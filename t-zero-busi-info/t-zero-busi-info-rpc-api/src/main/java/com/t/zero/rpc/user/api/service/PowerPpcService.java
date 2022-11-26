package com.t.zero.rpc.user.api.service;

public interface PowerPpcService {


	public Boolean isSuper(Integer userId,Integer tentId);

	public  Boolean isOrgnization(Integer userIdInt);

	Boolean isOrgnizationManager(Integer userIdInt,Integer tentId);
}
