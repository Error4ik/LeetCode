package com.company.leetcode.remove_element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int number : nums) {
            if (number != val) {
                nums[index++] = number;
            }
        }
        return index;
    }
}
