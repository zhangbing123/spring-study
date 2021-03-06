package com.zb.study.ioc.service.impl;

import com.zb.study.ioc.entity.Car;
import com.zb.study.ioc.service.CarService;
import com.zb.study.ioc.service.PersonService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 13:49
 **/
@Transactional
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private PersonService personService;

//	public CarServiceImpl(PersonService personService) {
//		this.personService = personService;
//		System.out.println("这是CarServiceImpl的构造方法");
//	}

	public CarServiceImpl() {
		System.out.println("这是CarServiceImpl的构造方法");
	}

	@Override
	public Car getCar(String name) {

		Car car = ((CarService) AopContext.currentProxy()).setCar(name);

		System.out.println("正在调用....");
		return car;
	}

	@Override
	public Car setCar(String name) {
		Car car = new Car();
		car.setName(name);
		car.setColor("red");
		return car;
	}
}
