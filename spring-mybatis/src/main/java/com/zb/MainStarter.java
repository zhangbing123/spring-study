package com.zb;

import com.zb.config.MyBatisConfig;
import com.zb.entity.User;
import com.zb.mapper.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class MainStarter {

    public static void main(String[] args) {
    	// 记载spring上下文
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyBatisConfig.class);
		UserMapper bean = (UserMapper) ioc.getBean("userMapper");
		User user = bean.selectById(1L);
		System.out.println(user);

		/*UserMapper userMapper =(UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(), new Class[]{UserMapper.class}, (proxy, method, args1) -> {
			// 查询数据库...
			System.out.println("查询");
			return new User();
		});
		userMapper.selectById(1L);*/
	}
}
