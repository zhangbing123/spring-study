package com.zb.study.configAnnotationsDiffer;

import com.zb.study.ioc.entity.Car;
import com.zb.study.ioc.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @description:测试@Component和@Configuration区别
 * @author: zhangbing
 * @create: 2020-10-15 16:00
 **/

@Component
public class TestComponent {

	@Bean
	public Person person() {
		Person person = new Person("张三");
		person.setCar(car());
		person.setCar2(car());
		person.setCar3(car());
		return person;
	}

	@Bean
	public Car car() {
		return new Car("奔驰", "白色");
	}
}
