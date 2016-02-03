package com.tutorial.spring.javaconfig;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorial.spring.javaconfig.StaffConfig;
import com.tutorial.spring.model.Staff;

public class StaffConfigTest {
	
	private static ApplicationContext context;
	
	@BeforeClass
	public static void setup() {
		context = new AnnotationConfigApplicationContext(StaffConfig.class);
	}
	
	@Test
	public void testHelloWorld() {
		Staff helloWorld = (Staff) context.getBean("staffBean");
		assertThat(helloWorld).isNotNull();
		assertThat(helloWorld.getName()).isEqualTo("staff");
	}
	
	@Test (expected=NoSuchBeanDefinitionException.class)
	public void testNoSuchHelloWorldBean() {
		context.getBean("staffXXX");
	}
	
}
