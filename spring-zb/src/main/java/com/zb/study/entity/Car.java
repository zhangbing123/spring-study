package com.zb.study.entity;

/**
 * @Description: java类作用描述
 * @Author: wangzx
 * @CreateDate: 2019/12/9 14:49
 */
public class Car {

    public Car() {
        System.out.println("car构造方法");
    }

    private String name;
    private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
