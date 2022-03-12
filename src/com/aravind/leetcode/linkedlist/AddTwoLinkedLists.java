package com.aravind.leetcode.linkedlist;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoLinkedLists {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode dummy2 = dummy;
        int carry = 0;
        int sum;
        while(l1 != null && l2 != null)
        {
            sum = l1.val + l2.val + carry;
            if(sum >= 10)
            {
                sum = sum %10;
                carry = 1;
            }
            else
                carry = 0;

            ListNode temp = new ListNode(sum);
            dummy2.next = temp;
            dummy2 = dummy2.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 != null)
        {
            sum = l1.val + carry;
            if(sum >= 10)
            {
                sum = sum %10;
                carry = 1;
            }
            else
                carry = 0;
            ListNode temp = new ListNode(sum);
            dummy2.next = temp;
            dummy2 = dummy2.next;
            l1=l1.next;
        }
        while(l2 != null)
        {
            sum = l1.val + carry;
            if(sum >= 10)
            {
                sum = sum %10;
                carry = 1;
            }
            else
                carry = 0;
            ListNode temp = new ListNode(sum);
            dummy2.next = temp;
            dummy2 = dummy2.next;
            l2=l2.next;
        }
        if(carry != 0)
            dummy2.next = new ListNode(carry);
        return dummy.next;
    }

    public static void main(String... args)
    {
        ListNode one = new ListNode(9);
        ListNode two = new ListNode(9);
        ListNode three = new ListNode(9);

        one.next = two;
        two.next = three;

        ListNode four = new ListNode(5);
        ListNode five = new ListNode(6);
        ListNode six = new ListNode(4);

        four.next = five;
        five.next = six;

        ListNode nnewHead = addTwoNumbers(one,four);
        while(nnewHead != null)
        {
            System.out.println(nnewHead.val+ " ");
            nnewHead = nnewHead.next;
        }

    }

}
