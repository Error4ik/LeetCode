package com.company.leetcode.longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String value = "";
        if (strs.length == 0) {
            return value;
        }
        String startWord = strs[0];
        for (int i = 0; i <= startWord.length(); i++) {
            String s = startWord.substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(s)) {
                    return value;
                }
            }
            value = s;
        }
        return value;
    }
}
