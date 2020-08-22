package com.company.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    Example:
//    Given nums = [2, 7, 11, 15], target = 9,
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//    return [0, 1].

    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];

            if (map.containsKey(number) && map.get(number) != i) {
                result = new int[]{i, map.get(number)};
                break;
            }
        }

        return result;
    }
}
