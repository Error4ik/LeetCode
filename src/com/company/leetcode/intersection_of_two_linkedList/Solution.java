package com.company.leetcode.intersection_of_two_linkedList;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode firstNode = headA;
        ListNode secondNode = headB;

        while (firstNode != null || secondNode != null) {
            if (firstNode == secondNode) {
                return firstNode;
            }
            firstNode = firstNode == null ? headB : firstNode.next;
            secondNode = secondNode == null ? headA : secondNode.next;
        }
        return null;
    }
}
