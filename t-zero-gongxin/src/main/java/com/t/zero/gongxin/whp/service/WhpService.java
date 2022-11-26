package com.t.zero.gongxin.whp.service;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class WhpService {

	@Autowired
	public DataSource dataSource;

	public Object doAction(ObjectNode objectNode) throws SQLException {
		var conn = dataSource.getConnection();
		var sql = objectNode.get("sql").asText();
		System.out.print(sql);
		var t = conn.prepareStatement(sql);
		var r = t.execute(sql);
		conn.commit();
		conn.close();
		return r;
	}
}
