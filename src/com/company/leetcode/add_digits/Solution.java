package com.company.leetcode.add_digits;

public class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num > 9) {
            while (num != 0) {
                int tmp = num % 10;
                sum += tmp;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        return num;
    }
}
