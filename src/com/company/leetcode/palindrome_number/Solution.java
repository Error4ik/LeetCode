package com.company.leetcode.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String str = String.valueOf(x);
        char[] numbers = str.toCharArray();
        int length = numbers.length;
        int middle = length / 2;

        for (int i = 0; i < middle; i++) {
            if (numbers[i] != numbers[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
