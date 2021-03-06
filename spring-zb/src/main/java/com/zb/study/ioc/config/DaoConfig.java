package com.zb.study.ioc.config;

import com.zb.study.ioc.dao.CarDao;
import com.zb.study.ioc.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: zhangbing
 * @create: 2019-12-12 10:42
 **/
@Configuration
public class DaoConfig {

	@Bean(initMethod = "initPerson")
	public PersonDao personDao() {
		return new PersonDao();
	}

	@Bean
	public CarDao carDao() {
		return new CarDao();
	}

}
