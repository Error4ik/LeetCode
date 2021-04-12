package com.company.leetcode.intersection_of_two_arrays;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }

        int i = 0;
        int[] result = new int[list.size()];

        for (Integer integer : list) {
            result[i++] = integer;
        }

        return result;
    }
}

//        int[] freq = new int[1001];
//        List<Integer> list = new ArrayList<>();
//        for (int x : nums1) {
//            freq[x]++;
//        }
//        for (int x : nums2) {
//            if (freq[x] > 0) {
//                list.add(x);
//                freq[x] = 0;
//            }
//        }
//        int[] res = new int[list.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = list.get(i);
//        }
//        return res;
