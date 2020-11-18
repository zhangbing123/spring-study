package com.zb.study.extend;

/**
 * @description: 自定义类
 * @author: zhangbing
 * @create: 2020-11-18 15:10
 **/
public class CustomerClass {

	private String name;

	public void test() {
		System.out.println("这是一个自定义的类，spring扫描不到，通过实现BeanDefinitionRegisterBeanPostProcessor注册进去的,name+" + name);
	}

	public void init() {
		System.out.println("CustomerClass对象的初始化方法");
	}

	public void setName(String name) {
		this.name = name;
	}
}
