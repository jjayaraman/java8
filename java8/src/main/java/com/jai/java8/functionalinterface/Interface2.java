package com.jai.java8.functionalinterface;

public interface Interface2 {

	default int add(int a, int b) {
		return 1 + a + b;
	}

}
