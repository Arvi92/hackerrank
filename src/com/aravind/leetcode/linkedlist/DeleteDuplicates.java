package com.aravind.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-200,head);
        ListNode prev = dummy;

        while(head != null)
        {
            System.out.println(" prev " + prev.val + " " + head.val);
            if(prev.val != head.val)
            {
                prev.next = head;
                prev = head;
            }
            head = head.next;
        }
        prev.next = null;

        return dummy.next;

    }

    public static ListNode deleteDuplicates2(ListNode head) {

        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        int prevVal = prev.val;
        while(head != null)
        {
            System.out.println(" prev " + prevVal + " " + head.val);
            if(prevVal != head.val)
            {
                prev.next = head;
                prev = head;
            }

            prevVal = head.val;
            head = head.next;
        }

        return dummy.next;

    }

    public static void main(String... args)
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(2);
        //ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
       // three.next = four;

        ListNode newHead = deleteDuplicates(one);

        while(newHead != null)
        {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
