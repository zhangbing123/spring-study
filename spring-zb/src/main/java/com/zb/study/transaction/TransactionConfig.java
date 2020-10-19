package com.zb.study.transaction;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @description: 事务配置
 * @author: zhangbing
 * @create: 2020-10-15 15:53
 **/
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true)//exposeProxy暴露代理对象到ThreadLocal中
@ComponentScan(basePackages = {"com.zb.study.transaction"})
public class TransactionConfig {

	/**
	 * 配置数据源
	 */
	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql:///jdbc_test0?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	/**
	 * 配置JdbcTemplate
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	/**
	 * 配置事务管理器
	 * TransactionManager
	 */
	@Bean
	public PlatformTransactionManager platformTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
