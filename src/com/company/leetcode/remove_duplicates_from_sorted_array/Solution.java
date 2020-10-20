package com.company.leetcode.remove_duplicates_from_sorted_array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        //Do not allocate extra space for another array, you must do this
        //by modifying the input array in-place with O(1) extra memory.
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return ++index;
    }
}
