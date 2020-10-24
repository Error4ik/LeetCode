package com.company.leetcode.maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int minValue = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > minValue) {
                minValue = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return minValue;
    }
}
