package com.company.leetcode;

import com.company.leetcode.add_two_numbers.AddTwoNumbers;
import com.company.leetcode.add_two_numbers.ListNode;
import com.company.leetcode.two_sum.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        //TwoSum
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));

        //AddTwoNumbers
        ListNode listNode = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(listNode, listNode2);
    }
}
