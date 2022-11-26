package com.t.zero.rpc.user.api.component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.t.zero.rpc.user.api.constants.SimpleGroupConstants;
import com.t.zero.rpc.user.api.service.GroupRpcService;

/**
 * @author davinzhang
 * 
 * @date 2021/11/18
 * 
 * @desc TODO
 */

public class GroupRpcComponent {

    public final GroupRpcService groupRpcService;
    private final ObjectMapper mapper;

    public GroupRpcComponent(ObjectMapper mapper, GroupRpcService groupRpcService) {
        this.groupRpcService = groupRpcService;
        this.mapper = mapper;
    }

    public Map<?, String> getSimpleGroups(Integer t, List<?> uIds) {
        if (CollectionUtils.isEmpty(uIds)) {
            return Map.of();
        } else {
            var ids = uIds.get(0) instanceof Integer
                ? uIds.stream().toArray(Integer[]::new)
                : uIds.stream().map(i -> (String)i).map(i -> Integer.valueOf(i)).toArray(Integer[]::new);

            var results = Arrays.asList(groupRpcService.sg(t, ids)).stream().map(i -> {
                try {
                    return mapper.readTree(i);
                } catch (JsonProcessingException e) {
                    return null;
                }
            }).filter(ObjectUtils::isNotEmpty).collect(Collectors.toList());

            return uIds.get(0) instanceof Integer
                ? results.stream().collect(Collectors.toMap(i -> i.get(SimpleGroupConstants.GROUP_ID).asInt(), i -> i.get(SimpleGroupConstants.GROUP_NAME).asText()))
                : results.stream().collect(Collectors.toMap(i -> i.get(SimpleGroupConstants.GROUP_ID).asText(), i -> i.get(SimpleGroupConstants.GROUP_NAME).asText()));
        }
    }

}
