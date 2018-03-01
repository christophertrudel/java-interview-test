package org.interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void palindrome() {
        String testCase = "kayak";
        assertTrue(
                testCase + " palindrome expected to be true",
                Palindrome.isPalindrome(testCase)
        );
    }

    @Test
    public void palindromeCase() {
        String testCase = "Kayak";
        assertFalse(
                testCase + " palindromeCase expected to be false",
                Palindrome.isPalindrome(testCase)
        );
    }

    @Test
    public void palindromeCaseWithSupportCase() {
        String testCase = "Kayak";
        assertTrue(
                testCase + " palindromeWithSupportCase expected to be true",
                Palindrome.isPalindrome(testCase, true)
        );
    }

    @Test
    public void palindromePhrase() {
        String testCase = "no melon, no lemon?";
        assertFalse(
                testCase + " palindromePhrase expected to be false",
                Palindrome.isPalindrome(testCase, false, false)
        );
    }

    @Test
    public void palindromePhraseWithSupportPhrase() {
        String testCase = "no melon, no lemon?";
        assertTrue(
                testCase + " palindromePhraseWithSupportPhrase expected to be true",
                Palindrome.isPalindrome(testCase, false, true)
        );
    }

    @Test
    public void palindromeCasePhraseWithSupportPhrase() {
        String testCase = "No melon, no lemon?";
        assertFalse(
                testCase + " palindromeCasePhraseWithSupportPhrase expected to be false",
                Palindrome.isPalindrome(testCase, false, true)
        );
    }

    @Test
    public void palindromeCasePhraseWithSupportCaseSupportPhrase() {
        String testCase = "No melon, no lemon?";
        assertTrue(
                testCase + "palindromeCasePhraseWithSupportCaseSupportPhrase expected to be true",
                Palindrome.isPalindrome(testCase, true, true)
        );
    }

    @Test
    public void notPalindrome() {
        String testCase = "test";
        assertFalse(
                testCase + " notPalindrome expected to be false",
                Palindrome.isPalindrome(testCase)
        );
    }

    @Test
    public void notPalindromeWithSupportCase() {
        String testCase = "Test";
        assertFalse(
                testCase + " notPalindromeWithSupportCase expected to be false",
                Palindrome.isPalindrome(testCase, true)
        );
    }

    @Test
    public void notPalindromePhraseWithSupportPhrase() {
        String testCase = "captain, my captain.";
        assertFalse(
                testCase + " notPalindromePhraseWithSupportPhrase expected to be false",
                Palindrome.isPalindrome(testCase, false, true)
        );
    }

    @Test
    public void notPalindromePhraseWithSupportCaseSupportPhrase() {
        String testCase = "Captain, my captain.";
        assertFalse(
                testCase + " notPalindromePhraseWithSupportCaseSupportPhrase expected to be false",
                Palindrome.isPalindrome(testCase, true, true)
        );
    }
}
