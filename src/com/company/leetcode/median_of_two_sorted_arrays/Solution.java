package com.company.leetcode.median_of_two_sorted_arrays;

import java.util.Arrays;

public class Solution {

//    Given two sorted arrays nums1 and nums2 of size m and n respectively.
//    Return the median of the two sorted arrays.
//    Follow up: The overall run time complexity should be O(log (m+n)).
//
//    Example 1:
//
//    Input: nums1 = [1,3], nums2 = [2]
//    Output: 2.00000
//    Explanation: merged array = [1,2,3] and median is 2.
//    Example 2:
//
//    Input: nums1 = [1,2], nums2 = [3,4]
//    Output: 2.50000
//    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//    Example 3:
//
//    Input: nums1 = [0,0], nums2 = [0,0]
//    Output: 0.00000
//    Example 4:
//
//    Input: nums1 = [], nums2 = [1]
//    Output: 1.00000
//    Example 5:
//
//    Input: nums1 = [2], nums2 = []
//    Output: 2.00000
//
//    Constraints:
//    nums1,length == m
//    nums2,length == n
//    0 <= m <= 1000
//    0 <= n <= 1000
//    1 <= m + n <= 2000
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int oneIndex = 0;
        int twoIndex = 0;
        int resultIndex = 0;
        int mid = result.length / 2;

        while (oneIndex < nums1.length && twoIndex < nums2.length) {
            if (nums1[oneIndex] < nums2[twoIndex]) {
                result[resultIndex++] = nums1[oneIndex];
                oneIndex++;
            } else {
                result[resultIndex++] = nums2[twoIndex];
                twoIndex++;
            }
        }

        while (oneIndex < nums1.length) {
            result[resultIndex++] = nums1[oneIndex];
            oneIndex++;
        }

        while (twoIndex < nums2.length) {
            result[resultIndex++] = nums2[twoIndex];
            twoIndex++;
        }

        double median;

        if (resultIndex % 2 == 0) {
            int a = result[mid];
            int b = result[mid - 1];
            median = (double) (a + b) / 2;
        } else {
            median = result[resultIndex / 2];
        }

        return median;
    }
}
