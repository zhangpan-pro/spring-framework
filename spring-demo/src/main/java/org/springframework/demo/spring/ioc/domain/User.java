package org.springframework.demo.spring.ioc.domain;

import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author <a href="mailto:zhangpan252@gmail.com">ZhangPan</a>
 * @date 2021/6/13
 */
@Component
public class User {

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override public String toString() {
		return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
