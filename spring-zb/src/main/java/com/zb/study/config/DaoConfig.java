package com.zb.study.config;

import com.zb.study.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-12 10:42
 **/
@Configuration
public class DaoConfig {

	@Bean
	public PersonDao personDao(){
		return new PersonDao();
	}
}
