package com.zb.study.ioc.entity;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-13 17:13
 **/

public class Person {

	private String name;

	private Car car;
	private Car car2;
	private Car car3;

	public Person(String name) {
		this.name = name;
	}

	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCar(Car car){
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public Car getCar2() {
		return car2;
	}

	public void setCar2(Car car2) {
		this.car2 = car2;
	}

	public Car getCar3() {
		return car3;
	}

	public void setCar3(Car car3) {
		this.car3 = car3;
	}
}
