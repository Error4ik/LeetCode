package com.company.leetcode.length_of_last_word;

public class Solution {
    public int lengthOfLastWord(String s) {
//        String[] arr = s.trim().split(" ");
//        return arr[arr.length - 1].length();

        s = s.trim();
        int i = s.length() - 1;
        int length = 0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                length++;
                i--;
            }
        }
        return length;
    }
}
