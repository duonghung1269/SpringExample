package com.tutorial.spring.hdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorial.spring.javaconfig.MainAppConfig;
import com.tutorial.spring.model.Customer;

public class ImportConfigTest {

private static ApplicationContext context;
	
	@BeforeClass
	public static void setup() {
		context = new AnnotationConfigApplicationContext(MainAppConfig.class);
	}
	
	@Test
	public void testCustomer() {
		Customer customer = (Customer) context.getBean(Customer.class);
		assertThat(customer).isNotNull();
		assertThat(customer.getName()).isEqualTo("hdd");
	}
}
