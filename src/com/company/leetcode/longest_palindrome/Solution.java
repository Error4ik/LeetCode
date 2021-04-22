package com.company.leetcode.longest_palindrome;

public class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        int length = 0;

        for (int aChar : chars) {
            length += aChar / 2 * 2;
            if (length % 2 == 0 && aChar % 2 == 1) {
                length++;
            }
        }

        return length;
    }
}
