package com.aravind.leetcode.linkedlist;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int val)
    {
       this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
public class CycleInLinkedList {

    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null)
            return false;
        ListNode slowPtr = head.next;
        ListNode fastPtr = head.next.next;

        while(fastPtr != null && fastPtr.next != null)
        {
            if(slowPtr == fastPtr)
                return true;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return false;
    }

    public static void main(String []args)
    {
        ListNode three = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode zero = new ListNode(0);
        ListNode minusFour = new ListNode(-4);

        three.next = two;
        two.next = null;
        zero.next = minusFour;
        minusFour.next = minusFour;

        System.out.println(hasCycle(three));
    }


}
