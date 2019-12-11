package com.zb.study.service.impl;

import com.zb.study.entity.Car;
import com.zb.study.service.CarService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 13:49
 **/
@Service
public class CarServiceImpl implements CarService {

	public CarServiceImpl() {
		System.out.println("这是CarServiceImpl的构造方法");
	}

	@Override
	public Car getCar(String name) {
		Car car = new Car();
		car.setName(name);
		car.setColor("red");
		return car;
	}
}
