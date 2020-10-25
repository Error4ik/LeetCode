package com.company.leetcode.contains_int_to_array;

public class Solution {
    public boolean binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while (start <= end) {
            middle = start + (end - start) / 2;
            if (arr[middle] < x) {
                start = middle + 1;
            } else if (arr[middle] > x) {
                end = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
