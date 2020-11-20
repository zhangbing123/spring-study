package com.zb.study.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @description: 订单服务
 * @author: zhangbing
 * @create: 2020-10-15 17:55
 **/

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	@Override
	public void commit(Long orderId) {
		System.out.println("创建订单....");
		String sql = "INSERT INTO t_order VALUES (?, ?, ?);";
		int k = jdbcTemplate.update(sql, orderId, "测试订单", 3333);

//		System.out.println(1 / 0);

	}

	@Override
	public void find(Long orderId) {
		List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from t_order where order_id =" + orderId);
		System.out.println(maps);
	}
}
