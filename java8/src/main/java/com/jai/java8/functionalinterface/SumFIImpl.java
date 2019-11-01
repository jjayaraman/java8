package com.jai.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class SumFIImpl implements SumFI {

    public static void main(String[] args) {
        SumFIImpl addFIImpl = new SumFIImpl();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Result : " + addFIImpl.sum(numbers));

    }

    /**
     * Function interface implementation
     *
     * @param numbers
     * @return
     */
    @Override
    public Integer sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n).sum();
    }
}
