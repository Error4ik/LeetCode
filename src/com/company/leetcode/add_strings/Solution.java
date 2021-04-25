package com.company.leetcode.add_strings;


import java.math.BigInteger;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int firstIndex = num1.length() - 1;
        int secondIndex = num2.length() - 1;
        int remains = 0;

        while (firstIndex >= 0 || secondIndex >= 0) {
            int a = firstIndex >= 0 ? num1.charAt(firstIndex) - 48 : 0;
            int b = secondIndex >= 0 ? num2.charAt(secondIndex) - 48 : 0;

            int result = (a + b + remains) % 10;
            remains = (a + b + remains) / 10;

            sb.append(result);

            firstIndex--;
            secondIndex--;
        }

        if (remains != 0) {
            sb.append(remains);
        }

        return sb.reverse().toString();
    }
}
