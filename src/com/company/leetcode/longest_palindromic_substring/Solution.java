package com.company.leetcode.longest_palindromic_substring;

import java.util.*;

public class Solution {

//    Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//
//    Example 1:
//    Input: "babad"
//    Output: "bab"
//    Note: "aba" is also a valid answer.

    //    Example 2:
//    Input: "cbbd"
//    Output: "bb"
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int one = checkAround(s, i, i);
            int two = checkAround(s, i, i + 1);
            int maxLength = Math.max(one, two);
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    //Проверка элементов сбоку от выбранного.
    public int checkAround(String s, int left, int right) {
        int leftIndex = left;
        int rightIndex = right;

        while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            leftIndex--;
            rightIndex++;
        }

        return rightIndex - leftIndex - 1;
    }
}
