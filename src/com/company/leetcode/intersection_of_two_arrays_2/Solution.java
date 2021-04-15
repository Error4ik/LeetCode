package com.company.leetcode.intersection_of_two_arrays_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                list.add(nums1[index1++]);
                index2++;
                continue;
            }

            if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                index1++;
            }
        }


        int index = 0;
        int[] result = new int[list.size()];

        for (Integer integer : list) {
            result[index++] = integer;
        }

        return result;
    }
}
