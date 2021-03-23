package com.company.leetcode.range_sum_query_Immutable;

public class NumArray {
    private final int[] array;

    public NumArray(int[] nums) {
        this.array = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += array[i];
        }
        return sum;
    }
}
