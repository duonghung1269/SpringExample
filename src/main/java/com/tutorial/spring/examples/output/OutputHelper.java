package com.tutorial.spring.examples.output;

public class OutputHelper {

	IOutputGenerator outputGenerator;

	public String generateOutput() {
		return outputGenerator.generateOutput();
	}

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}