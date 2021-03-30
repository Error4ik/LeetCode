package com.company.leetcode.matrix_diagonal_sum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += mat[i][i] + mat[i][length - i - 1];
        }
        if (length % 2 != 0) {
            result = result - mat[length / 2][length / 2];
        }
        return result;
    }
}
