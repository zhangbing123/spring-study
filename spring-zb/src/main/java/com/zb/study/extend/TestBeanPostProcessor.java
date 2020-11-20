package com.zb.study.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description: bean的后置处理器 扩展点
 * 在实例化之后 属性赋值之后  初始化之前
 * @author: zhangbing
 * @create: 2020-11-20 16:32
 **/
public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("postProcessBeforeInitialization：在bean 初始化之前调用,在此处你可以自定义一个bean返回去，spring直接把这bean注册到容器中");

		return null;
	}
}
