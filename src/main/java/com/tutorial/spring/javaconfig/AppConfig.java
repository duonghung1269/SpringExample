package com.tutorial.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.spring.hdd.HelloWorld;

@Configuration
public class AppConfig {
	
	@Bean(name="helloWorldBean")
	public HelloWorld helloWord() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("hddTest");
		return helloWorld;
	}
	
}
