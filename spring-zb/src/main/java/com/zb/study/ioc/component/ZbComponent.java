package com.zb.study.ioc.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: 测试组件
 * @author: zhangbing
 * @create: 2019-12-17 16:05
 **/
@Component
public class ZbComponent implements BeanNameAware, BeanPostProcessor, DisposableBean, InitializingBean {

	@Override
	public void setBeanName(String name) {
		System.out.println("实现了BeanNameAware：" + name);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("在" + beanName + "初始化之前做一些事情");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("在" + beanName + "初始化之后做一些事情");
		return bean;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("销毁bean:ZbComponent");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
