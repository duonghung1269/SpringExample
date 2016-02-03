package com.tutorial.spring.hdd;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:HelloWorldConfig.xml" })
public class HelloWorldTest {

	@Autowired
	private HelloWorld helloWorld;

	@Test
	public void testHelloWorld() {
		assertThat(helloWorld).isNotNull();
		assertThat(helloWorld.getName()).isEqualTo("hdd");
	}
}
