package com.company.leetcode.is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }

        int sIndex = 0;

        for (char c : t.toCharArray()) {
            if (c == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
