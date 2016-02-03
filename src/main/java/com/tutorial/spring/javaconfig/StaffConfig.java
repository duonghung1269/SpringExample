package com.tutorial.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.spring.model.Staff;

@Configuration
public class StaffConfig {
	
	@Bean(name="staffBean")
	public Staff helloWord() {
		Staff helloWorld = new Staff();
		helloWorld.setName("staff");
		return helloWorld;
	}
	
}
