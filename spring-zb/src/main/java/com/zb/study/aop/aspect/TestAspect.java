package com.zb.study.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description: AOP测试 切面类
 * @author: zhangbing
 * @create: 2019-12-31 15:59
 **/
@Aspect
@Component
public class TestAspect {

	/**
	 * 定义一个切入点
	 */
	@Pointcut("execution(* com.zb.study.aop.service.impl*..*(..))")
	public void pointCut() {
	}


	/**
	 * 前置通知方法
	 *
	 * @param joinPoint
	 */
	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println(name + "方法前置通知");
	}

	/**
	 * 后置通知方法
	 *
	 * @param joinPoint
	 */
	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println(name + "方法后置通知");
	}

	/**
	 * 返回结果的方法
	 *
	 * @param joinPoint
	 * @param val
	 */
	@AfterReturning(value = "pointCut()", returning = "val")
	public void afterReturning(JoinPoint joinPoint, Object val) {
		String name = joinPoint.getSignature().getName();
		if (val != null) {
			System.out.println(name + "方法返回通知：" + val.toString());
		}
	}

	/**
	 * 异常抛出后的通知方法
	 *
	 * @param joinPoint
	 */
	@AfterThrowing(value = "pointCut()")
	public void afterThrowing(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();

		System.out.println(name + "方法调用异常通知");
	}

}
