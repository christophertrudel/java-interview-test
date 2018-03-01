package org.interview;

public class PalindromeAdvanced extends Palindrome {
    private String[] possiblePalindromes;

    public PalindromeAdvanced(String[] possiblePalindromes) {
        this.possiblePalindromes = possiblePalindromes;
    }

    public String[] getPossiblePalindromes() {
        return possiblePalindromes;
    }

    public void setPossiblePalindromes(String[] possiblePalindromes) {
        this.possiblePalindromes = possiblePalindromes;
    }

    public boolean isAllPalindrome() {
        for (String palindrome:this.possiblePalindromes)
        {
            if (!isPalindrome(palindrome)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        return isPalindrome(text, true, true);
    }
}
