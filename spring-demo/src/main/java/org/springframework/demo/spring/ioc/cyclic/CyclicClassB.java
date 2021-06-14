package org.springframework.demo.spring.ioc.cyclic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/6/14
 */
@Component
public class CyclicClassB {

	@Autowired
	private CyclicClassA cyclicClassA;

	public void say() {
		System.out.println("classB -> " + cyclicClassA.getClass());
	}
}
