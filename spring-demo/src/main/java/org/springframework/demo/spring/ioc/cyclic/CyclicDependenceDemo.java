package org.springframework.demo.spring.ioc.cyclic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/6/14
 */
@Configuration
@ComponentScan("org.springframework.demo.spring.ioc.cyclic")
public class CyclicDependenceDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicDependenceDemo.class);
		CyclicClassA cyclicClassA = (CyclicClassA)applicationContext.getBean("cyclicClassA");
		cyclicClassA.say();
		CyclicClassB cyclicClassB = (CyclicClassB)applicationContext.getBean("cyclicClassB");
		cyclicClassB.say();
	}
}
