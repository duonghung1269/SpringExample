package com.tutorial.spring.collections;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorial.spring.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:customerDate.xml"})
public class CustomerDateTest {
	
	@Autowired
	private Customer customerBean;
	
	@Test
	public void testInjectDateCustomer() {
		assertThat(customerBean).isNotNull();
		assertThat(customerBean.getDob()).isNotNull();
	}
	
}
