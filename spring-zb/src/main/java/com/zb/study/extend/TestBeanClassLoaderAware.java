package com.zb.study.extend;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

/**
 * @description: BeanClassLoaderAware扩展点
 * 属性赋值之后  初始化之前调用setBeanClassLoader  获取bean的类加载器
 * @author: zhangbing
 * @create: 2020-11-18 16:51
 **/
@Component
public class TestBeanClassLoaderAware implements BeanClassLoaderAware {
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {

		System.out.println("当前bean的类加载器:" + classLoader);

	}
}
