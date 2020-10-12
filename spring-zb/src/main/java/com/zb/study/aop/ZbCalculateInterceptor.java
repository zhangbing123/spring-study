package com.zb.study.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Description: 方法拦截器
 * @Author: zhangbing
 * @CreateDate: 2020/9/26 11:15 AM
 */
public class ZbCalculateInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(getClass() + "调用方法前");
		Object ret = invocation.proceed();
		System.out.println(getClass() + "调用方法后");
		return ret;
	}
}
