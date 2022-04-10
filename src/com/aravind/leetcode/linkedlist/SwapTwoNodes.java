package com.aravind.leetcode.linkedlist;

public class SwapTwoNodes {

    public static ListNode swapNodes(ListNode head, int k) {

        ListNode dummy = new ListNode(0,head);

        ListNode curr = head;
        ListNode newHead = head;

        int m = k-2;
        while(k>0){
            curr = curr.next;
            k--;
        }
        while(curr.next != null){
            head = head.next;
            curr = curr.next;
        }
        while(m>0){
            newHead = newHead.next;
        }

        ListNode temp = newHead;
        newHead.next.next = head.next.next;
        head.next.next = temp.next.next;
        newHead.next = head.next;
        head.next = temp.next;

        return dummy.next;
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
        five.next = null;

        ListNode newHead = swapNodes(one,2);

        while(newHead != null)
        {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }

    }
}
