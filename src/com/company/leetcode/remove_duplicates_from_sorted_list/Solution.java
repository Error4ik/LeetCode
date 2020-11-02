package com.company.leetcode.remove_duplicates_from_sorted_list;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode listNode = head;
        while (listNode != null && listNode.next != null) {
            if (listNode.val == listNode.next.val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return head;
    }
}
