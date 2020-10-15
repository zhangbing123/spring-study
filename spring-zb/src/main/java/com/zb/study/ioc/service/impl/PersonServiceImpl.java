package com.zb.study.ioc.service.impl;

import com.zb.study.ioc.entity.Person;
import com.zb.study.ioc.service.CarService;
import com.zb.study.ioc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-13 17:14
 **/
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private CarService carService;

//	public PersonServiceImpl(CarService carService) {
//		this.carService = carService;
//		System.out.println("这是一个PersonServiceImpl的构造方法");
//	}
	public PersonServiceImpl() {
		System.out.println("这是一个PersonServiceImpl的构造方法");
	}

	@Override
	public Person getPerson() {
		carService.getCar("汽车");
		Person person = new Person();
		person.setName("zhangsan");
		return person;
	}
}
