package com.zb.study.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: 订单服务
 * @author: zhangbing
 * @create: 2020-10-15 17:55
 **/
@Transactional
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void commit(Long orderId) {
		System.out.println("创建订单....");
		String sql = "INSERT INTO t_order VALUES (?, ?, ?);";
		jdbcTemplate.update(sql, orderId, "测试订单", 3333);

		System.out.println(1 / 0);

	}
}
