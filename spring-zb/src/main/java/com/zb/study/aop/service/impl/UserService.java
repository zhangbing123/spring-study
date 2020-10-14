package com.zb.study.aop.service.impl;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-09-29 10:42
 **/
@Component
public class UserService {

	public String say(String name) {
		System.out.println("i am " + name);
		return name;
	}
}
