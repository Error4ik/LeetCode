package com.company.leetcode.remove_duplicates_from_sorted_list_two;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        boolean isDuplicate = false;
        ListNode resultNode = new ListNode();
        ListNode tmp = resultNode;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                isDuplicate = true;
            } else {
                if (!isDuplicate) {
                    tmp.next = new ListNode(head.val);
                    tmp = tmp.next;
                }
                isDuplicate = false;
            }
            head = head.next;
        }
        return resultNode.next;
    }
}
