package com.company.leetcode.number_of_segments_in_a_string;

public class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        return s.split("\\s+").length;
    }
}
