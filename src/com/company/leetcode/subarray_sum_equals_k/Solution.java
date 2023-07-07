package com.company.leetcode.subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. Subarray Sum Equals K
 * Medium
 * 18.8K
 * 549
 * Companies
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 *
 * @author Alexey Voronin.
 * @since 07.07.2023.
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int subarraySum = 0;
                for (int l = i; l < j + 1; l++) {
                    subarraySum += nums[l];
                }
                if (subarraySum == k) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int subarraySum2(int[] nums, int k) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int subarraySum = 0;
            for (int j = i; j < nums.length; j++) {
                subarraySum += nums[j];
                if (subarraySum == k) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int subarraySum3(int[] nums, int k) {
        int answer = 0;
        int subarraySum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        for (int num : nums) {
            subarraySum += num;
            int toRemove = subarraySum - k;
            answer += prefixSumCount.getOrDefault(toRemove, 0);
            int prevCount = prefixSumCount.getOrDefault(subarraySum, 0);
            prefixSumCount.put(subarraySum, prevCount + 1);
        }

        return answer;
    }
}
