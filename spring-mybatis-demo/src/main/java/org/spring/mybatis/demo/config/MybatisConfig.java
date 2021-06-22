package org.spring.mybatis.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Administrator
 */
@EnableTransactionManagement
@MapperScan("org.spring.mybatis.demo.mapper")
@Configuration
public class MybatisConfig {


	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		sqlSessionFactoryBean.setTransactionFactory(new SpringManagedTransactionFactory());
		return sqlSessionFactoryBean;
	}

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test?allowMultiQueries=true&serverTimezone=Asia/Shanghai");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		return dataSource;
	}

}
