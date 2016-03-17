package com.tutorial.spring.scope;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorial.spring.model.annotation.CustomerService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:scope/ScopePrototypeAnnotation.xml"})
public class CutomerServicePrototypeAnnotationTest {
	
	private static ApplicationContext context;
	
	@BeforeClass
	public static void init() {
		context = new ClassPathXmlApplicationContext("classpath*:scope/ScopePrototypeAnnotation.xml");
	}
	
	@Test
	public void testPrototypeScope() {
		CustomerService customerServiceA = (CustomerService) context.getBean(CustomerService.class);
		customerServiceA.setMessage("custA");
		assertThat(customerServiceA.getMessage()).isEqualTo("custA");
		
		CustomerService customerServiceB = (CustomerService) context.getBean(CustomerService.class);
		assertThat(customerServiceB.getMessage()).isNull();
	}
}
