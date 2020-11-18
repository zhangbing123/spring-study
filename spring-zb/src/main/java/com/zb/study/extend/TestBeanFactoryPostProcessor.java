package com.zb.study.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @description: BeanFactoryPostProcessor扩展点
 *
 * 发生在扫描所有的bean定义之后 创建bean之前
 *
 * @author: zhangbing
 * @create: 2020-11-18 15:18
 **/
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//注意 不要再此处直接创建bean 不要调用beanFactory.getBean() beanFactory.getBeansOfType()等方法 原因：https://www.jianshu.com/p/3d099ea43b0e

		/**
		 * 可以拿到BeanDefinition并进行相关浸入修改
		 */
		BeanDefinition customerClass = beanFactory.getBeanDefinition("customerClass");
		customerClass.setLazyInit(true);//设置懒加载
		customerClass.setInitMethodName("init");//设置初始化方法
	}
}
