package com.zb.component;

import com.zb.entity.User;
import com.zb.mapper.UserMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.reflect.Proxy;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        UserMapper userMapper=(UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(), new Class[]{UserMapper.class}, (proxy, method, args1) -> {
            // 查询数据库...   mybatis    SqlSession.getOne()
            System.out.println("查询");
            return new User();
        });
        beanFactory.registerSingleton("userMapper",userMapper);

    }
}
