package org.interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeAdvancedTest {
    @Test
    public void palindrome() {
        String testCase = "kayak";
        assertTrue(
                testCase + " palindrome expected to be true",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void palindromeCase() {
        String testCase = "Kayak";
        assertTrue(
                testCase + " palindromeCase expected to be true",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void palindromePhrase() {
        String testCase = "no melon, no lemon?";
        assertTrue(
                testCase + " palindromePhrase expected to be true",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void palindromeCasePhrase() {
        String testCase = "No melon, no lemon?";
        assertTrue(
                testCase + " palindromeCasePhrase expected to be true",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void notPalindrome() {
        String testCase = "test";
        assertFalse(
                testCase + " notPalindrome expected to be false",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void notCasePalindrome() {
        String testCase = "Test";
        assertFalse(
                testCase + " notCasePalindrome expected to be false",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void notPalindromePhrase() {
        String testCase = "captain, my captain.";
        assertFalse(
                testCase + " notPalindromePhrase expected to be false",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void notPalindromeCasePhrase() {
        String testCase = "Captain, my captain.";
        assertFalse(
                testCase + " notPalindromeCasePhrase expected to be false",
                PalindromeAdvanced.isPalindrome(testCase)
        );
    }

    @Test
    public void isAllPalindromePassFail() {
        String[] palindromes = {
                "kayak",
                "Kayak",
                "no melon, no lemon?",
                "No melon, no lemon?"
        };

        String[] notAllPalindromes = {
                "kayak",
                "Kayak",
                "captain, my captain."
        };

        PalindromeAdvanced palindromeAdvanced = new PalindromeAdvanced(palindromes);

        assertTrue(
                "possiblePalindromes are all palindromes",
                palindromeAdvanced.isAllPalindrome()
        );

        palindromeAdvanced.setPossiblePalindromes(notAllPalindromes);

        assertFalse(
                "notAllPalindromes are not all palindromes",
                palindromeAdvanced.isAllPalindrome()
        );
    }
}
