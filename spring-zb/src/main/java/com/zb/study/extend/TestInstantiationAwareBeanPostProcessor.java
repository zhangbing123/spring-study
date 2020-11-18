package com.zb.study.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @description: InstantiationAwareBeanPostProcessor扩展点
 * Bean的后置处理器
 * 调用时间：实例化bean之前
 * @author: zhangbing
 * @create: 2020-11-18 15:43
 **/
@Component
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	/**
	 * 实例化之前调用
	 *
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName  the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

		if (beanClass == A.class) {
			System.out.println("在实例化A之前调用,返回一个B的实例");
			//若在此处返回一个对象 spring会认为你已经进行初始化过了 不会在调用postProcessAfterInstantiation  直接调用postProcessAfterInitialization
			return new B();
		}


		/**
		 * 可以拿到 Class对象和beanName
		 * 如果在这一步 自己通过反射 返回对应的实例 那么spring就不在走后面实例化bean的逻辑了
		 *
		 * AOP的切面的解析和通知的解析都是通过AnnotationAwareAspectJAutoProxyCreator 实现了InstantiationAwareBeanPostProcessor
		 * 在这个方法中执行的 解析成切面类和通知类
		 *
		 */

		return null;
	}

	/**
	 * 实例化之后调用
	 *
	 * @param bean     the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		/**
		 * 正常情况下 spring容器在实例化之后 会调用此方法
		 */

		if (bean instanceof CustomerClass) {
			System.out.println("实例化CustomerClass 之后调用,设置bean的name参数为 123");
			((CustomerClass) bean).setName("123");
		}
		return false;
	}

	/**
	 * 属性赋值时调用
	 *
	 * @param pvs      the property values that the factory is about to apply (never {@code null})
	 * @param bean     the bean instance created, but whose properties have not yet been set
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		/**
		 * @Autowired,@Resource等注解原理基于此方法实现
		 */
		return null;
	}

	/**
	 * 属性赋值时 调用 但是目前这个方法已被spring 弃用了
	 * @param pvs the property values that the factory is about to apply (never {@code null})
	 * @param pds the relevant property descriptors for the target bean (with ignored
	 * dependency types - which the factory handles specifically - already filtered out)
	 * @param bean the bean instance created, but whose properties have not yet been set
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		return null;
	}

	/**
	 * BeanPostProcessor的方法  初始化之前调用
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof CustomerClass) {
			System.out.println("CustomerClass对象初始化之前被调用:postProcessBeforeInitialization");
		}
		return null;
	}

	/**
	 * BeanPostProcessor的方法 初始化之后调用
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof A) {
			System.out.println("A对象是自己实例化的，spring直接调用初始化之后的方法，在此处设置name参数");
			((A) bean).setName("当前A实例是被B代理的");
		} else if (bean instanceof CustomerClass) {
			System.out.println("CustomerClass对象初始化之后被调用：postProcessAfterInitialization");
		}

		return null;
	}
}
