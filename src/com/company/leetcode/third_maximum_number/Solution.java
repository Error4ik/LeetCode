package com.company.leetcode.third_maximum_number;

public class Solution {
    public int thirdMax(int[] nums) {
        int first = nums[0];
        Integer second = null;
        Integer third = null;

        for (int i : nums) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            } else if (second == null || i > second) {
                if (first != i) {
                    third = second;
                    second = i;
                }
            } else if (third == null || i > third) {
                if (first != i && second != i) {
                    third = i;
                }
            }
        }

        if (third == null) {
            return first;
        }

        return third;
    }
}
