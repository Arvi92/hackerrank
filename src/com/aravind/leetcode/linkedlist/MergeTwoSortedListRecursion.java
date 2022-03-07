package com.aravind.leetcode.linkedlist;

public class MergeTwoSortedListRecursion {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        if(list1.val < list2.val)
        {
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoLists(list2.next,list1);
            return list2;

        }
    }

    public static void main(String... args)
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;
        three.next = null;

        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        four.next = five;
        five.next = six;
        six.next = null;
        ListNode newHead = mergeTwoLists(one, four);
//        ListNode newHead = four;
        while(newHead != null)
        {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
