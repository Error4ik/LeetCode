package com.company.leetcode.majority_element;

import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int majorityElement = 0;
        int tmp = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > tmp) {
                tmp = integerIntegerEntry.getValue();
                majorityElement = integerIntegerEntry.getKey();
            }
        }

        return majorityElement;
    }
}
