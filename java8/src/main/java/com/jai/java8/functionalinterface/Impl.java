package com.jai.java8.functionalinterface;

public class Impl implements Interface1, Interface2 {

	public static void main(String[] args) {
		Impl impl = new Impl();

		System.out.println(impl.add(1, 2));
		System.out.println(impl.add(1, 2, 3));
	}

	@Override
	public int add(int a, int b, int c) {
		return 0;
	}

	@Override
	public int add(int a, int b) {
		return Interface1.super.add(a, b);
	}

}
