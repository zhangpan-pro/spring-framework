package org.springframework.demo.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.spring.ioc.domain.User;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/6/13
 */
public class AnnotationApplicationContextDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		User user = (User)applicationContext.getBean("user");

		System.out.println(user);

	}
}
