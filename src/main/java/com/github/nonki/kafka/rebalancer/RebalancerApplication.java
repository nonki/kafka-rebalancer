package com.github.nonki.kafka.rebalancer;

public class RebalancerApplication {
	public String getGreeting() {
		return "Hello, World!";
	}

	public static void main(String[] args) {
		System.out.println(new RebalancerApplication().getGreeting());
	}
}
