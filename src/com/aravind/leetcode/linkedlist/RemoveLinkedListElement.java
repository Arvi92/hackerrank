package com.aravind.leetcode.linkedlist;

/*

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.


Better solution in neetcode
https://www.youtube.com/watch?v=JI71sxtHTng&ab_channel=NeetCode
 */

public class RemoveLinkedListElement {

    public static ListNode removeElements(ListNode head, int val) {

        if(head == null || (head.val == val && head.next == null))
            return null;

        ListNode prev = null;
        ListNode newHead = null;
        while(head != null)
        {
            if(head.val == val && prev != null)
            {
                prev.next = head.next;
            }
            else if(head.val != val)
            {
                if(newHead == null)
                    newHead = head;
                prev = head;
            }

            head = head.next;
        }
        return newHead;
    }

    public static void main(String... args)
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(1);

        one.next = two;
        two.next = three;
        three.next = four;

        ListNode newHead = removeElements(one,2);

        while(newHead != null)
        {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
