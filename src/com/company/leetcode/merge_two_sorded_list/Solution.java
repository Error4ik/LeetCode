package com.company.leetcode.merge_two_sorded_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode resultNode;
        ListNode tmpOne = l1;
        ListNode tmpTwo = l2;

        if (tmpOne.val < tmpTwo.val) {
            resultNode = tmpOne;
            tmpOne = tmpOne.next;
        } else {
            resultNode = tmpTwo;
            tmpTwo = tmpTwo.next;
        }

        ListNode tmp = resultNode;

        while (tmpOne != null && tmpTwo != null) {
            if (tmpOne.val < tmpTwo.val) {
                tmp.next = tmpOne;
                tmpOne = tmpOne.next;
            } else {
                tmp.next = tmpTwo;
                tmpTwo = tmpTwo.next;
            }
            tmp = tmp.next;
        }
        if (tmpOne != null) {
            tmp.next = tmpOne;
        }
        if (tmpTwo != null) {
            tmp.next = tmpTwo;
        }

        return resultNode;
    }
}
