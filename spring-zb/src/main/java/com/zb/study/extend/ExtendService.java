package com.zb.study.extend;

import org.springframework.stereotype.Service;

/**
 * @description: 测试扩展方法
 * @author: zhangbing
 * @create: 2020-11-18 10:44
 **/
@Service
public class ExtendService {

	private CustomerClass customerClass;

	public void test() {
		System.out.println("测试扩展方法");
	}
}
