package com.company.leetcode.merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int oneIndex = 0;
        int twoIndex = 0;
        int resultIndex = 0;
        int[] arr = new int[m + n];

        while (oneIndex < m && twoIndex < n) {
            if (nums1[oneIndex] > nums2[twoIndex]) {
                arr[resultIndex++] = nums2[twoIndex++];
            } else {
                arr[resultIndex++] = nums1[oneIndex++];
            }
        }

        while (oneIndex < m) {
            arr[resultIndex++] = nums1[oneIndex++];
        }

        while (twoIndex < n) {
            arr[resultIndex++] = nums2[twoIndex++];
        }

        resultIndex = 0;

        while (resultIndex < m + n) {
            nums1[resultIndex] = arr[resultIndex++];
        }
    }
}
