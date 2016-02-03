package com.tutorial.spring.hdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorial.spring.examples.output.OutputHelper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:OutputConfig.xml" })
public class OutputHelperTest {

	@Autowired
	private OutputHelper outputHelper;

	@Test
	public void testGenerator() {
		assertThat(outputHelper).isNotNull();
		assertThat(outputHelper.generateOutput()).isEqualTo("json");
	}
}
