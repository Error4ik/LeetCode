package com.company.leetcode.add_strings;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int one = num1.length() - 1;
        int two = num2.length() - 1;
        int carry = 0;

        while (one >= 0 || two >= 0) {
            int a = one >= 0 ? num1.charAt(one--) - '0' : 0;
            int b = two >= 0 ? num2.charAt(two--) - '0' : 0;

            int sum = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;

            sb.append(sum);
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
