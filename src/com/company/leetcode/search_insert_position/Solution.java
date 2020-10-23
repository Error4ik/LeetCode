package com.company.leetcode.search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
            count++;
        }

        return count;
    }
}
