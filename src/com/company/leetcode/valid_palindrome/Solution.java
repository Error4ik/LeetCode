package com.company.leetcode.valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            while (start < s.length() && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (end >= 0 && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (start > s.length() || end < 0) {
                break;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
        //StringBuilder sb = new StringBuilder(s.trim().replaceAll("[^a-zA-Z0-9]", ""));
        //return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}
