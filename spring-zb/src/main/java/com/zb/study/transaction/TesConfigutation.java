//package com.zb.study.transaction;
//
//import com.zb.study.ioc.entity.Car;
//import com.zb.study.ioc.entity.Person;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @description:测试@Component和@Configuration区别
// * @author: zhangbing
// * @create: 2020-10-15 16:00
// **/
//
//@Configuration
//public class TesConfigutation {
//
//	@Bean
//	public Person person() {
//		Person person = new Person("张三");
//		person.setCar(car());
//		return person;
//	}
//
//	@Bean
//	public Car car() {
//		return new Car("奔驰", "白色");
//	}
//}
