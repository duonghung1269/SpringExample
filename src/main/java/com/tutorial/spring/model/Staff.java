package com.tutorial.spring.model;

public class Staff {

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
