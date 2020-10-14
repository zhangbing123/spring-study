package com.zb.study.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @description: Calculate的拦截器
 * @author: zhangbing
 * @create: 2020-09-29 09:40
 **/
public class CalculateInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("方法调用前......");
		Object proceed = invocation.proceed();
		System.out.println("方法调用后......");
		return proceed;

	}
}
