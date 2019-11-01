package com.jai.java8.functionalinterface;

@FunctionalInterface
public interface AddFI {

	// FI can have only one abstract method
	int add(int a, int b);

	// More than one method would give this error
	// "Multiple non-overriding abstract method found in interface xxx"
	// void invalidSecondMeth();
}
