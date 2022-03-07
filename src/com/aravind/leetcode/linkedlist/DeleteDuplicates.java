package com.aravind.leetcode.linkedlist;

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

    public static void main(String... args)
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        three.next = four;

        ListNode newHead = deleteDuplicates(one);

        while(newHead != null)
        {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
