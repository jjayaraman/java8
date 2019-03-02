package com.jai.java8.functionalinterface;

@FunctionalInterface
public interface Interface1 {

	int add(int a, int b, int c);

	// Java8 - default method definition in interface
	default int add(int a, int b) {
		return a + b;
	}

}
