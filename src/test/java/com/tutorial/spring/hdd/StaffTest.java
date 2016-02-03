package com.tutorial.spring.hdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorial.spring.model.Staff;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:StaffConfig.xml" })
public class StaffTest {

	@Autowired
	private Staff staffBean;

	@Test
	public void testHelloWorld() {
		assertThat(staffBean).isNotNull();
		assertThat(staffBean.getName()).isEqualTo("staff");
	}
}
