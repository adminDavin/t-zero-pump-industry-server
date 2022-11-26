package com.t.zero.b.i.pump.db.dao.filters;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL) 
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class ProjectHeaderFilters {
	private String userId;
	public Integer tenantId;
}
