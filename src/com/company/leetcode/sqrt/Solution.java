package com.company.leetcode.sqrt;

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long start = 0;
        long end = x / 2;

        while (end >= start) {
            long middle = start + (end - start) / 2;
            if (middle * middle > x) {
                end = middle - 1;
            } else if (middle * middle < x) {
                start = middle + 1;
            } else {
                return (int) middle;
            }
        }
        return (int) end;
    }
}
