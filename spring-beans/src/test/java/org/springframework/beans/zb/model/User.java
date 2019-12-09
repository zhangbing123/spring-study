package org.springframework.beans.zb.model;

/**
 * @description: 用户Bean
 * @author: zhangbing
 * @create: 2019-03-17 11:56
 **/
public class User {

	private String name = "zhangsan";//姓名

	private int age;//年龄

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
