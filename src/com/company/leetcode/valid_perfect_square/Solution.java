package com.company.leetcode.valid_perfect_square;

public class Solution {
    public boolean isPerfectSquare(int num) {
        //Math.sqrt(Integer.MAX_VALUE) = 46340

        if (num == 1) {
            return true;
        }

        int left = 1;
        int right = 46430;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle * middle == num) {
                return true;
            }
            if (middle * middle > num) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}
