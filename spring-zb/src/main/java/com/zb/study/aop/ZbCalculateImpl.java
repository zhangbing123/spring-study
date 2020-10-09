package com.zb.study.aop;

public class ZbCalculateImpl implements ZbCalculate {

	@Override
	public void add(int i, int k) {
		System.out.println("执行目标方法add");
		System.out.println("执行结果：" + (i + k));

	}

	@Override
	public void sub(int i, int k) {
		System.out.println("执行目标方法sub");
		System.out.println("执行结果：" + (i - k));
	}

	@Override
	public void mul(int i, int k) {
		System.out.println("执行目标方法mul");
		System.out.println("执行结果：" + (i * k));
	}

	@Override
	public void div(int i, int k) {
		System.out.println("执行目标方法div");
		System.out.println("执行结果：" + (i / k));
	}
}
