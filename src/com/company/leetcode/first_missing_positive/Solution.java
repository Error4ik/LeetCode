package com.company.leetcode.first_missing_positive;

import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int number = 1;

        for (int num : nums) {
            if (number < num) {
                return number;
            }

            if (number < num + 1) {
                number = num + 1;
            }
        }

        return number;
    }
}
