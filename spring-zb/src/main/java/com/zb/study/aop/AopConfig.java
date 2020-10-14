package com.zb.study.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-09-29 09:34
 **/
@ComponentScan(value = "com.zb.study.aop")
@EnableAspectJAutoProxy//开启aop
@Configuration
public class AopConfig {


//	@Bean
//	public CalculateAdvice calculateAdvice() {
//		return new CalculateAdvice();
//	}
//
//	@Bean
//	public CalculateInterceptor calculateInterceptor() {
//		return new CalculateInterceptor();
//	}

	/**
	 * 这种方式缺点有两个：
	 * 1.如果指定多个Bean的AOP  则需要创建多个ProxyFactoryBean
	 * 2.拦截Bean的所有方法进行增强处理  无法针对单独某个方法进行增强处理
	 *
	 * @return
	 */
//	@Bean
//	public ProxyFactoryBean proxyFactoryBean() {
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setInterceptorNames("calculateAdvice", "calculateInterceptor");
//		proxyFactoryBean.setTargetName("zbCalculate");
//		return proxyFactoryBean;
//	}
//	@Bean
//	public NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor() {
//		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
//		advisor.setAdvice(calculateAdvice());
//		advisor.setMappedNames("add", "mul", "say");
//		return advisor;
//	}


	/**
	 * 使用NameMatchMethodPointcutAdvisor 定义一个通知者，内部配置需要通知的目标方法
	 * <p>
	 * 解决了无法针对某个 或 某些方法的拦截增强的问题
	 * 无法解决对于多个Bean的AOP实现，
	 *
	 * @return
	 */
//	@Bean
//	public ProxyFactoryBean proxyFactoryBean() {
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setInterceptorNames("nameMatchMethodPointcutAdvisor");
//		proxyFactoryBean.setTargetName("zbCalculate");
//		return proxyFactoryBean;
//	}

	/**
	 * 这种自动代理的方式 解决了上面的两个问题 而且在使用的时候 无需关心代理类
	 *
	 * @return
	 */
//	@Bean
//	public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
//		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//		beanNameAutoProxyCreator.setBeanNames("zbCalculate", "userService");
//		beanNameAutoProxyCreator.setInterceptorNames("nameMatchMethodPointcutAdvisor");
//		return beanNameAutoProxyCreator;
//	}

	/**
	 * 这一种方式 是获取Ioc容器的所有的advisor
	 * 进行拦截所有的bean的方法，进行织入增强
	 *
	 * @return
	 */
//	@Bean
//	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//		return new DefaultAdvisorAutoProxyCreator();
//	}

}
