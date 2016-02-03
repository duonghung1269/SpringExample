package com.tutorial.spring.hdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorial.spring.javaconfig.AppConfig;

public class AppConfigTest {
	
	private static ApplicationContext context;
	
	@BeforeClass
	public static void setup() {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
	
	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");
		assertThat(helloWorld).isNotNull();
		assertThat(helloWorld.getName()).isEqualTo("hddTest");
	}
	
	@Test (expected=NoSuchBeanDefinitionException.class)
	public void testNoSuchHelloWorldBean() {
		context.getBean("helloWorldBeanXXX");
	}
	
}
