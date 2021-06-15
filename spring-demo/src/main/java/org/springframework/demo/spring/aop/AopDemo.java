package org.springframework.demo.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/6/14
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("org.springframework.demo.spring.aop")
public class AopDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopDemo.class);
		AopTargetClass aopTargetClass = (AopTargetClass)applicationContext.getBean("aopTargetClass");
		aopTargetClass.method();
		aopTargetClass.methodException();
	}

}
