package com.company.leetcode.swap_nodes_in_pairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null && current.next != null) {
            ListNode tmp = current.next;
            current.next = current.next.next;
            tmp.next = current;

            current = tmp;
            if (previous == null) {
                head = tmp;
            } else {
                previous.next = tmp;
            }

            previous = current.next;
            current = current.next.next;
        }

        return head;

//        Recurs...
//        if(head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode temp = head.next;
//        head.next = swapPairs(temp.next);
//        temp.next = head;
//        return temp;
    }
}
