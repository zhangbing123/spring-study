package com.zb.study.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @description:BeanFactoryAware  扩展点
 *
 * 在bean实例化和属性赋值之后  初始化之前
 *
 * @author: zhangbing
 * @create: 2020-11-18 16:54
 **/
@Component
public class TestBeanFactoryAware implements BeanFactoryAware {
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory:拿到beanFactory 进行扩展开发");
	}
}
