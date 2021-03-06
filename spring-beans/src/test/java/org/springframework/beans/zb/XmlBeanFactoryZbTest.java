package org.springframework.beans.zb;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.zb.model.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import static org.springframework.tests.TestResourceUtils.qualifiedResource;

/**
 * @description: 对于XmlBeanFactory类的研究测试
 * @author: zhangbing
 * @create: 2019-03-17 11:50
 **/
public class XmlBeanFactoryZbTest {

	private final Class<?> CLASS = XmlBeanFactoryZbTest.class;

	@Test
	public void testXmlBeanFactory() {
		/**
		 * 通过ClassPathResource类把xml配置文件解析为Resource文件
		 * 通过XmlBeanFactory类把Resource文件转换为BeanFactory
		 */
		Resource ROOT_CONTEXT = qualifiedResource(CLASS, "zb.xml");
		//String.format("%s-%s", clazz.getSimpleName(), resourceSuffix)
		ClassPathResource resource = new ClassPathResource("BeanFactoryTest-zb.xml",CLASS);
		BeanFactory bf = new XmlBeanFactory(resource);
		User user = (User) bf.getBean("user");
		System.out.println(user.getName());
	}
}
