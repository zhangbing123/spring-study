package com.zb.study.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: aop配置
 * @Author: zhangbing
 * @CreateDate: 2020/9/26 11:06 AM
 */
@Configuration
public class AopConfig {

	/**
	 * 目标类 被代理的类
	 *
	 * @return
	 */
	@Bean
	public ZbCalculateImpl zbCalculate() {
		return new ZbCalculateImpl();
	}

	/**
	 * 通知类 advice方式
	 *
	 * @return
	 */
	@Bean
	public ZbCalculateAdvice zbCalculateAdvice() {
		return new ZbCalculateAdvice();
	}

	/**
	 * 方法拦截方式
	 *
	 * @return
	 */
	@Bean
	public ZbCalculateInterceptor zbCalculateInterceptor() {
		return new ZbCalculateInterceptor();
	}



	/**
	 * 1.代理factoryBean方式
	 * 这种方式 每代理一个类  就得创建一个ProxyFactoryBean 而且维度是以类的方式  无法拦截某个具体的方法
	 * 获取目标的类的实例时  需要获取目标类的代理类的实例
	 * @return
	 */
//	@Bean
//	public ProxyFactoryBean proxyFactoryBean(){
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setInterceptorNames("zbCalculateAdvice","zbCalculateInterceptor");
//		proxyFactoryBean.setTargetName("zbCalculate");
//		return proxyFactoryBean;
//	}


	/**
	 * 以advisor方式
	 *
	 * @return
	 */
	@Bean
	public NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor() {
		//需要有一个advisor通知者，advisor里面需要一个advice通知方法，
		NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
		nameMatchMethodPointcutAdvisor.setAdvice(zbCalculateAdvice());//指定通知方法 负责拦截方法之后逻辑处理
		nameMatchMethodPointcutAdvisor.setMappedNames("div", "add");//advisor负责增强那些方法  指定拦截的方法  只有div add 两个方法会被代理增强  其他方法不会被增强
		return nameMatchMethodPointcutAdvisor;
	}

	/**
	 * 2.代理factoryBean方式
	 * 注入advisor方式  可以实现增强的指定的具体方法，而不是类的全部方法  增强维度得到控制
	 * 但是还是无法解决  代理一个类 就得创建一个ProxyFactoryBean的问题  还有获取目标的类的实例时  需要获取目标类的代理类的实例
	 * @return
	 */
//	@Bean
//	public ProxyFactoryBean proxyFactoryBean(){
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setInterceptorNames("nameMatchMethodPointcutAdvisor");//传入一个advisor
//		proxyFactoryBean.setTargetName("zbCalculate");//指定目标类
//		return proxyFactoryBean;
//	}


	/**
	 * 以一种自动代理的方式 结合 advisor方式 解决第二种方式无法解决的问题
	 * 可以指定需要代理目标类，使用正则表达式的方式  指定多个需要被代理的目标类
	 * 指定一个advisor 可以控制增强的是类中的全部方法还是指定方法
	 * 且自动代理方式无需关心代理类，我们可以直接获取目标类并执行方法。
	 * @return
	 */
	@Bean
	public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
		beanNameAutoProxyCreator.setBeanNames("zbCalculate*");
		beanNameAutoProxyCreator.setInterceptorNames("nameMatchMethodPointcutAdvisor");
		return beanNameAutoProxyCreator;
	}

}
