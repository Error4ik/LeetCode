package com.company.leetcode.linked_list_cycle;

/**
 * TODO: comment.
 *
 * @author Alexey Voronin.
 * @since 08.07.2023.
 */
public class Runner {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l3;

        ListNode listNode = solution.detectCycle(l1);

        System.out.println(listNode.val);
    }
}
