package com.jai.quiz;


public class UserInput {

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

    // All char allowed
    public static class TextInput {
        String value = "";

        public void add(char c) {
            value = value + c;
        }

        public String getValue() {
            return value;
        }

    }

    // Only numbers
    public static class NumericInput extends TextInput {

        public void add(char c) {

            if (Character.isDigit(c)) {
                value = value + c;
            }

        }

    }
}