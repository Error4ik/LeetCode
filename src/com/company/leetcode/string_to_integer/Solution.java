package com.company.leetcode.string_to_integer;

public class Solution {
    public int myAtoi(String str) {
        if (str.trim().isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1;

        char[] c = str.trim().toCharArray();

        if (index < str.length() && c[index] == '+' || c[index] == '-') {
            if (c[index] == '-') {
                sign = -1;
            }
            index++;
        }

        StringBuilder builder = new StringBuilder();
        long result = 0;
        while (index < c.length) {
            char val = c[index++];
            if (val >= '0' && val <= '9') {
                builder.append(val);
                result = Long.parseLong(builder.toString()) * sign;
                if (result > Integer.MAX_VALUE) {
                    result = Integer.MAX_VALUE;
                    break;
                }
                if (result < Integer.MIN_VALUE) {
                    result = Integer.MIN_VALUE;
                    break;
                }
            } else {
                break;
            }
        }

        return (int) result;
    }
}
