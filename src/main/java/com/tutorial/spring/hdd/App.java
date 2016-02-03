package com.tutorial.spring.hdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello World
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		System.out.println(helloWorld);
	}
}
