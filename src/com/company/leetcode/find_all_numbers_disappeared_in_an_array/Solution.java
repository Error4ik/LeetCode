package com.company.leetcode.find_all_numbers_disappeared_in_an_array;

import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] flags = new boolean[nums.length + 1];
        for (int num : nums) {
            flags[num] = true;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < flags.length; i++) {
            if (!flags[i]) {
                list.add(i);
            }
        }

        return list;
    }
}
