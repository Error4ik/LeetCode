package com.company.leetcode.missing_number;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        if (nums.length != nums[nums.length - 1]) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i - 1] + 1;
            if (expectedNum != nums[i]) {
                return expectedNum;
            }
        }

        return -1;
    }
}

////  sum of n numbers can be known by n * (n-1)/2
//        int actualSum = 0;
//        for (int num : nums) {
//            actualSum += num;
//        }
//
//        int length = nums.length + 1;
//        int expectedSum = length * (length - 1) / 2;
//
//      return expectedSum - actualSum;
