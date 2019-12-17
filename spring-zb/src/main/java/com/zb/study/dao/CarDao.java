package com.zb.study.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 13:53
 **/
public class CarDao implements BeanNameAware, BeanPostProcessor, DisposableBean {
	@Override
	public void setBeanName(String name) {
		System.out.println("实现了BeanNameAware："+name);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("在"+beanName+"初始化之前做一些事情");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("在"+beanName+"初始化之后做一些事情");
		return bean;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("销毁bean：carDao");
	}
}
