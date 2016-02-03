package com.tutorial.spring.hdd;

public class HelloWorld {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}
}
