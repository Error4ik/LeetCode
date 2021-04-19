package com.company.leetcode.find_the_difference;

public class Solution {
    public char findTheDifference(String s, String t) {
        if (s.isEmpty()) {
            return t.charAt(0);
        }

        int[] chars = new int[26];
        chars[t.charAt(0) - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            chars[t.charAt(i + 1) - 'a']++;
            chars[s.charAt(i) - 'a']--;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                return (char) (i + 'a');
            }
        }

        return 0;
    }
}
