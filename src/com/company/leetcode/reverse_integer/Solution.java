package com.company.leetcode.reverse_integer;

public class Solution {
    public int reverse(int x) {
        boolean positiveNumber = x > 0;
        String number = String.valueOf(x);
        if (!positiveNumber) {
            number = number.replace("-", "");
        }
        StringBuilder builder = new StringBuilder(number);
        builder.reverse();
        number = positiveNumber ? builder.toString() : "-" + builder.toString();
        long result = Long.parseLong(number);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
