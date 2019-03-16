package com.jai.quiz;

public class Palindrome {
    public static boolean isPalindrome(String word) {

        String wordArray[] = word.split("");
        int length = wordArray.length;

        for (int i = 0; i < length; i++) {
            System.out.println(wordArray[i] + ", " + wordArray[length - 1 - i]);
            if (!wordArray[i].equalsIgnoreCase(wordArray[length - 1 - i])) {
                return false;
            }

        }
        System.out.println(wordArray.length);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}