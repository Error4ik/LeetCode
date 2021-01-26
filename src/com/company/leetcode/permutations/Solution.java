package com.company.leetcode.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length - 1;
        permutation(nums, 0, len);

        return lists;
    }

    private void permutation(int[] arr, int start, int end) {
        if (start == end) {
            List<Integer> tmpList = new ArrayList<>();
            for (int i = 0; i <= start; i++) {
                tmpList.add(arr[i]);
            }
            lists.add(tmpList);
        } else {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);
                permutation(arr, start + 1, end);
                swap(arr, start, i);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
