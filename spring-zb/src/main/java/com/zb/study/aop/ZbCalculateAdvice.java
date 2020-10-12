package com.zb.study.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 定义前置通知
 */
public class ZbCalculateAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("执行目标方法【" + method.getName() + "】的<前置通知>,入参" + Arrays.asList(args));
	}
}
