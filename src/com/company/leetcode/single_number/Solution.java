package com.company.leetcode.single_number;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            } else {
                list.remove(Integer.valueOf(num));
            }
        }
        return list.get(0);
    }
}
