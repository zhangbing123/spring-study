package com.zb.study.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @description: BeanDefinitionRegisterPostProcessor扩展点
 * <p>
 * BeanDefinitionRegisterPostProcessor 继承了BeanFactoryPostProcessor
 * 所有也可以重写postProcessBeanFactory方法 获取beanFactory
 * <p>
 * 重写postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)  可以注册一些额外的BeanDefinition
 * <p>
 * postProcessBeanDefinitionRegistry(registry)调用时间：
 * pring扫描完成所有自定义的BeanDefinition之后，筛选出实现了BeanDefinitionRegisterPostProcessor的接口，直接创建bean，并且调用其postProcessBeanDefinitionRegistry
 * <p>
 * postProcessBeanFactory(beanFactory)调用时间:
 * 在调用完postProcessBeanDefinitionRegistry这个方法之后
 * 筛选出实现了BeanFactoryPostProcessor接口的Bean定义，直接实例化，并且调用postProcessBeanFactory(beanFactory)
 * <p>
 * 这都是发生在扫描bean定义之后，创建bean之前
 * @author: zhangbing
 * @create: 2020-11-18 15:06
 **/
@Component
public class TestBeanDefinitionRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("实现BeanDefinitionRegistryPostProcessor，获取Bean的注册器，开始自定义注册bean定义");
		RootBeanDefinition beanDefinition = new RootBeanDefinition(CustomerClass.class);
		registry.registerBeanDefinition("customerClass", beanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
