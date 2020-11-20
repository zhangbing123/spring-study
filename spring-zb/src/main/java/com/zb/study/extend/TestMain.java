package com.zb.study.extend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: zhangbing
 * @create: 2020-11-18 10:45
 **/
public class TestMain {


	/**
	 * BeanDefinitionRegisterPostProcessor扩展点：扫描bean定义之后 创建bean之前
	 * BeanFactoryPostProcessor扩展点：紧跟着BeanDefinitionRegisterPostProcessor之后调用
	 * InstantiationAwareBeanPostProcessor扩展点： 实例化之前被调用一个方法  实例化之后被调用一个方法  属性赋值阶段  初始化之前  初始化之后
	 * BeanNameAware：方法setBeanName(String name)，实例化之后 属性赋值之后，初始化时
	 * BeanClassLoaderAware：方法setBeanClassLoader(ClassLoader classLoader),实例化之后 属性赋值之后，初始化时
	 * BeanFactoryAware：setBeanFactory(BeanFactory beanFactory)，实例化之后 属性赋值之后，初始化时
	 * InitializingBean：afterPropertiesSet()，初始化时调用此方法 进行一些初始化操作
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		CustomerClass customerClass = (CustomerClass) configApplicationContext.getBean("customerClass");
		customerClass.test();
		A a = (A) configApplicationContext.getBean("a");
		a.test();
	}
}
