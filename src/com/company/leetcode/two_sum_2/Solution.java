package com.company.leetcode.two_sum_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int number = target - numbers[i];

            if (map.containsKey(number) && map.get(number) != i) {
                result[0] = i + 1;
                result[1] = map.get(number) + 1;
                break;
            }
        }
        return result;
    }
}
