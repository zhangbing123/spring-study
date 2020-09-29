package com.zb.study.aop;

import com.zb.study.aop.service.CalculateService;
import com.zb.study.aop.service.impl.CalculateServiceImpl;
import com.zb.study.aop.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-09-29 10:07
 **/
public class MainTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//		ZbCalculate proxyFactoryBean = context.getBean("proxyFactoryBean", ZbCalculate.class);
//		proxyFactoryBean.sub(1,2);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		userService.say("zhangsan");

		CalculateService calculateService = context.getBean("calculateServiceImpl", CalculateService.class);
		calculateService.add(1,2);
//		zbCalculate.div(1,0);

	}
}
