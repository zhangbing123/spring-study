package com.zb.study.transaction.service;

/**
 * @description: 订单服务
 * @author: zhangbing
 * @create: 2020-10-15 17:54
 **/
public interface OrderService {

	void commit(Long orderId);

	void find(Long orderId);
}
