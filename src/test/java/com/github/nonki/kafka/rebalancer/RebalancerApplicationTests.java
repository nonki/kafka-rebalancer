package com.github.nonki.kafka.rebalancer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RebalancerApplicationTests {
	@Test
	void rebalancerHasGreeting() {
		RebalancerApplication subject = new RebalancerApplication();
		assertEquals("Hello, World!", subject.getGreeting());
	}
}
