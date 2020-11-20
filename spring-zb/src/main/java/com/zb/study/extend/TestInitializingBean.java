package com.zb.study.extend;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @description: InitializingBean 扩展点
 * 在bean初始化时 如果bean实现了InitializingBean了  则调用其afterPropertiesSet方法
 * @author: zhangbing
 * @create: 2020-11-20 16:36
 **/
@Component
public class TestInitializingBean implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet：bean初始化时，调用这个方法  可以对bean做一些初始化操作");
	}
}
