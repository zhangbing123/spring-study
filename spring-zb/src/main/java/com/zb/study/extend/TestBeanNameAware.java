package com.zb.study.extend;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @description:BeanNameAware扩展点 setBeanName()初始化一开始被调用
 * @author: zhangbing
 * @create: 2020-11-18 16:41
 **/
@Component
public class TestBeanNameAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName：获取到beanName:" + name);
	}
}
