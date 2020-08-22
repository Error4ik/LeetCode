package com.company.leetcode;

import com.company.leetcode.two_sum.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
