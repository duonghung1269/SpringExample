package com.tutorial.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.spring.model.Customer;

@Configuration
public class CustomerConfig {

	@Bean(name="customer")
	public Customer customerModel() {
		Customer customer = new Customer();
		customer.setName("hdd");
		return customer;
	}
	
}
