package com.tutorial.spring.examples.output.impl;

import com.tutorial.spring.examples.output.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {

	public String generateOutput() {
		return "csv";
	}
}