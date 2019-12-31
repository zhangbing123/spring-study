package com.zb.study.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description: AOP测试
 * @author: zhangbing
 * @create: 2019-12-31 15:59
 **/
@Aspect
@Component
public class CarAspect {

	@Pointcut("execution(* com.zb.study.service.impl.CarServiceImpl..*(..))")
	public void pointCut(){}


	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"方法调用之前");
	}

	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"方法调用之后");
	}

	@AfterReturning(value = "execution(* com.zb.study.service.impl.CarServiceImpl..*(..))",returning = "val")
	public void afterReturning(JoinPoint joinPoint,Object val){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"方法返回："+val.toString());
	}

	@AfterThrowing(value = "pointCut()")
	public void afterThrowing(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		System.out.println(name+"方法调用异常");
	}

}
