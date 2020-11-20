package com.zb.study.transaction;

import com.zb.study.transaction.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 测试事务
 * @author: zhangbing
 * @create: 2020-10-15 15:52
 **/

public class TestTransaction {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
		OrderService orderService = (OrderService) context.getBean("orderServiceImpl");
//		orderService.commit(2L);
		orderService.find(1L);
	}
}
