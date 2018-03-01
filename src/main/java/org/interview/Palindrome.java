package org.interview;

public class Palindrome {
    public Palindrome() {
        System.out.println("Constructor called");
    }

    public static boolean isPalindrome(String text) {
        return isPalindrome(text, false, false);
    }

    public static boolean isPalindrome(String text, boolean supportCase) {
        return isPalindrome(text, supportCase, false);
    }

    public static boolean isPalindrome(String text, boolean supportCase, boolean supportPhrase) {
        if (supportCase) {
            text = text.toLowerCase();
        }

        if (supportPhrase) {
            text = text.replaceAll("[^A-Za-z]+", "");
        }

        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
