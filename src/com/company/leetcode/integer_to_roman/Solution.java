package com.company.leetcode.integer_to_roman;

public class Solution {
    public String intToRoman(int num) {
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder sb = new StringBuilder();
        int i = nums.length - 1;
        while (num > 0){
            while (nums[i] <= num) {
                sb.append(romans[i]);
                num -= nums[i];
            }
            i--;
        }
        return sb.toString();
    }
}
