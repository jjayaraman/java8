package com.jai.java8.functionalinterface;

public class AddFIImpl implements AddFI {

    public static void main(String[] args) {
        AddFIImpl addFIImpl = new AddFIImpl();
        System.out.println("Result : " + addFIImpl.add(1, 2));
    }

    /**
     * Function interface implementation
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
