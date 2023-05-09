package com.company.leetcode.search_a_2d_matrix2;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 09.05.2023.
 */
public class Runner {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int[][] matrix2 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(solution.searchMatrix(matrix, 5)); //true
        System.out.println(solution.searchMatrix(matrix2, 20)); //false
        System.out.println(solution.searchMatrixTwo(matrix, 5)); //true
        System.out.println(solution.searchMatrixTwo(matrix2, 20)); //false
    }
}
