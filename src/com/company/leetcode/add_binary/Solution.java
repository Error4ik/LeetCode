package com.company.leetcode.add_binary;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int sum = 0;

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        while (aIndex >= 0 || bIndex >= 0 || sum == 1) {
            sum += (aIndex >= 0 ? a.charAt(aIndex--) - '0' : 0);
            sum += (bIndex >= 0 ? b.charAt(bIndex--) - '0' : 0);
            result.insert(0, (char) (sum % 2 + '0'));
            sum = sum / 2;
        }

        return result.toString();
    }
}
