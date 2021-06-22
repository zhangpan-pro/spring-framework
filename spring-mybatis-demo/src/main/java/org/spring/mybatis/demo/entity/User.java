package org.spring.mybatis.demo.entity;

public class User {
	private Long id;
	private String username;
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\'' + ", age=" + age + '}';
	}
}
