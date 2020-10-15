package com.zb.study.aop;

import com.zb.study.aop.service.CalculateService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class TestAopMain {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
//		ZbCalculate proxyFactoryBean = applicationContext.getBean("proxyFactoryBean", ZbCalculate.class);
//		proxyFactoryBean.div(1,2);

		//aspectj 方式
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		CalculateService proxyFactoryBean = applicationContext.getBean("calculateServiceImpl", CalculateService.class);
		proxyFactoryBean.sub(1,2);
	}
}
