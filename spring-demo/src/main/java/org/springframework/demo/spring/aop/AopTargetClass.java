package org.springframework.demo.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class AopTargetClass {

	public void method() {
		System.out.println("Invoke Method");
	}


	public void methodException() {
		System.out.println("Invoke Exception Method");
		throw new IllegalStateException("发生异常了");
	}

}
