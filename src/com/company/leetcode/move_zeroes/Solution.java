package com.company.leetcode.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int indexWithZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[indexWithZero];
                nums[indexWithZero] = nums[i];
                nums[i] = tmp;
                indexWithZero++;
            }
        }
    }
}
