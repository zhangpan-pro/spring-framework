package org.spring.mybatis.demo;

import org.spring.mybatis.demo.config.MybatisConfig;
import org.spring.mybatis.demo.entity.User;
import org.spring.mybatis.demo.mapper.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MybatisConfig.class);

		UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
		User user = userMapper.selectById(1L);
		System.out.println(user);
	}
}
