package com.tutorial.spring.xmlconfig;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorial.spring.model.FileNameGenerator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:inject_value/FileNameGeneratorAll.xml" })
public class FileNameGeneratorInjectValueTest {

	@Autowired
	private FileNameGenerator fileNameGenerators;
	
	@Test
	public void testHelloWorld() {
		assertThat(fileNameGenerators).isNotNull();
		assertThat(fileNameGenerators.getName()).isEqualTo("hddPSchema");
	}
}
