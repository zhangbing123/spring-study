package com.zb.study.ioc.service;


import com.zb.study.ioc.entity.Car;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-10 13:49
 **/
public interface CarService {

	Car getCar(String name);
	Car setCar(String name);
}
