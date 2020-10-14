package com.zb.study.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @description: 计算类的相关方法通知
 * @author: zhangbing
 * @create: 2020-09-29 09:38
 **/
public class CalculateAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName() + "的前置通知，入参：" + args);
	}
}
