package com.company.leetcode.linked_list_cycle;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (head != null && fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (fastNode == slowNode) {
                return true;
            }
        }
        return false;

//        Map<ListNode, Integer> listNodeIntegerMap = new HashMap<>();
//        ListNode ln = head;
//        while (ln != null) {
//            if (listNodeIntegerMap.containsKey(ln)) {
//                return true;
//            }
//            listNodeIntegerMap.put(ln, ln.val);
//            ln = ln.next;
//        }
//        return false;
    }
}
