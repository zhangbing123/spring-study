package com.zb.study.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAopMain {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
//		ZbCalculate proxyFactoryBean = applicationContext.getBean("proxyFactoryBean", ZbCalculate.class);
//		proxyFactoryBean.div(1,2);

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		ZbCalculate proxyFactoryBean = applicationContext.getBean("zbCalculate", ZbCalculate.class);
		proxyFactoryBean.sub(1,2);
	}
}
