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
//
//        if (x < 0)
//            return false;
//        int num = 0, orig = x;
//        while (x > 0) {
//            num = (num * 10) + (x % 10);
//            x = x / 10;
//        }
//        return orig == num;
    }
}
