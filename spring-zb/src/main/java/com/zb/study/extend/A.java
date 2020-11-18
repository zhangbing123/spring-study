package com.zb.study.extend;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-11-18 15:57
 **/
@Component
public class A {

	private String name;

	public void test() {
		System.out.println("调用A的test方法,name="+name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
