package com.company.leetcode.merge_k_sorted_lists;

import java.util.*;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (ListNode list : lists) {
            while (list != null) {
                priorityQueue.add(list.val);
                list = list.next;
            }
        }

        ListNode result = new ListNode();
        ListNode tmp = result;

        while (!priorityQueue.isEmpty()) {
            tmp.next = new ListNode(priorityQueue.remove());
            tmp = tmp.next;
        }

        return result.next;
    }
}

//        List<Integer> list = new ArrayList<>();
//        ListNode result = new ListNode();
//
//        for (ListNode listNode : lists) {
//            ListNode tmpListNode = listNode;
//            while (tmpListNode != null) {
//                list.add(tmpListNode.val);
//                tmpListNode = tmpListNode.next;
//            }
//        }
//
//        Collections.sort(list);
//        ListNode tmp = result;
//
//        for (Integer integer : list) {
//            tmp.next = new ListNode(integer);
//            tmp = tmp.next;
//        }
//
//        return result.next;
