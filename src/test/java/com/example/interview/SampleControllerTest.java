package com.example.interview;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SampleControllerTest {

	@Test
	void helloReturnsGreeting() {
		SampleController.Greeting greeting = new SampleController().hello();

		assertThat(greeting.message()).isEqualTo("Hello, world!");
	}
}
