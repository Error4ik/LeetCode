package com.company.leetcode.add_two_numbers;

public class AddTwoNumbers {

//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
//    reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//    Example:
//
//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807.

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode one = l1;
        ListNode two = l2;
        ListNode current = listNode;
        //Если сумма больше 10 то переносим единицу следующему.
        int i = 0;

        while (one != null || two != null) {
            //Записываем значения.
            int oneValue = one == null ? 0 : one.val;
            int twoValue = two == null ? 0 : two.val;

            //Складываем их.
            int sum = oneValue + twoValue + i;
            i = sum / 10;
            //Записываем остаток от деления на 10 в новую ноду.
            current.next = new ListNode(sum % 10);
            //Перемещаем ссылки на следующие элементы.
            current = current.next;

            if (one != null) {
                one = one.next;
            }

            if (two != null) {
                two = two.next;
            }
        }

        //Если последняя сумма чисел равна 10 то переносим 1.
        if (i > 0) {
            current.next = new ListNode(i);
        }

        return listNode.next;
    }
}
