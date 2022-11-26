 package com.t.zero.message.platform.service;

import java.util.List;

import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.model.auto.MessageScene;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;

public interface MessageSceneService {

    List<MessageScene> list(CommonParams params, MessageInstanceFilters filters, Integer currentPage, Integer pageSize);

    Integer save(CommonParams params, MessageScene messageScene);

    Integer modify(CommonParams params, MessageScene messageScene);

    Integer forbitScene(CommonParams params, Integer sceneId);

    Integer enableScene(CommonParams params, Integer sceneId);

    Integer delete(CommonParams params, Integer sceneId);

    Boolean initMessageDate(CommonParams params);
}
