package com.company.leetcode.subarray_sum_equals_k;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 07.07.2023.
 */
public class Runner {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = new int[]{7, 2, -5, 1, 1, -1, 5, -5};
        int k = 5;
        int correctAnswer = 5;

        int result = solution.subarraySum(arr, k);
        int result2 = solution.subarraySum2(arr, k);

        System.out.printf("Resul = %d, correct answer = %s%n", result, correctAnswer);
        System.out.printf("Resul = %d, correct answer = %s%n", result2, correctAnswer);

        arr = new int[]{4, 2, 2, 1, 2, -3, 5, -8};
        int result3 = solution.subarraySum3(arr, k);
        System.out.printf("Resul = %d, correct answer = %s%n", result3, correctAnswer);
    }
}
