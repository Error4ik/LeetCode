package com.company.leetcode;

import com.company.leetcode.add_two_numbers.AddTwoNumbers;
import com.company.leetcode.add_two_numbers.ListNode;
import com.company.leetcode.median_of_two_sorted_arrays.Solution;
import com.company.leetcode.two_sum.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        //TwoSum
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));

//        //AddTwoNumbers
//        ListNode listNode = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        addTwoNumbers.addTwoNumbers(listNode, listNode2);

//        //Length of longest subscripting.
//        Solution solution = new Solution();
//        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
//        System.out.println(solution.lengthOfLongestSubstring(""));
//        System.out.println(solution.lengthOfLongestSubstring(" "));
//        System.out.println(solution.lengthOfLongestSubstring("au"));
//        System.out.println(solution.lengthOfLongestSubstring("dvdf"));

        //Median of two sorted arrays.
        Solution solution = new Solution();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
