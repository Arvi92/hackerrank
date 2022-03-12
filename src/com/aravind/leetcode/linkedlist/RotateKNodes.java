package com.aravind.leetcode.linkedlist;

public class RotateKNodes {

    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null)
            return head;

        int length = 1;
        ListNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
            length++;
        }

        int newHeadPos = Math.abs(length - (k%length))%length;
        ListNode newHead = head;

        //System.out.println(length + " " +k + " " + k%length);
        while(newHeadPos > 0)
        {
            newHead = newHead.next;
            newHeadPos--;
        }


        while(temp.next != newHead)
        {
            temp.next = head;
            temp = temp.next;
            head = head.next;
        }
        temp.next = null;

        return newHead;
    }

    public static void main(String... args)
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode newHead = rotateRight(one,24);

        while(newHead != null)
        {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
