package com.zb.study.configAnnotationsDiffer;

import com.zb.study.ioc.entity.Car;
import com.zb.study.ioc.entity.Person;
import com.zb.study.transaction.TransactionConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-10-19 09:30
 **/

public class TestDifferMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);

		// 获取bean
		Person person = (Person) context.getBean("person");

		// 获取bean
		Car car = (Car) context.getBean("car");

		boolean result = person.getCar() == car;
		System.out.println(result ? "同一个car" : "不同的car");
	}
}
