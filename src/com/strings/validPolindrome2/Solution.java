package com.strings.validPolindrome2;

import java.util.Scanner;

public class Solution {

    public static boolean isPalindromeRange(String s, int i, int j) {
        //The palindrome must be either s[i+1], s[i+2], ..., s[j] or s[i], s[i+1], ..., s[j-1]
        //and we should check both cases
        for (int k = i; k <= i + (j-i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int lastIndex = s.length() - 1;
        for (int i = 0; i < s.length()/2; i++) {
            //Here is we check word for a palindrome
            //Compare chars in the beginning and end in the word by they indexes. Indexes should be parallel each other
            if(s.charAt(i) != s.charAt(lastIndex - i)) {
                int j = lastIndex - i;
                if(isPalindromeRange(s, i+1, j) || isPalindromeRange(s, i, j-1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean answer = validPalindrome(str);
        System.out.println(answer ? "True" : "False");

    }
}
