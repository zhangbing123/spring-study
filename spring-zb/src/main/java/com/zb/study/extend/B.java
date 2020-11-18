package com.zb.study.extend;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-11-18 15:58
 **/
public class B extends A {

	@Override
	public void test() {
		System.out.println("先调用B的test方法");
		super.test();
	}
}
