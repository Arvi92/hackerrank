package com.aravind.leetcode.linkedlist;

import java.util.HashMap;

/*


Better solution at
https://www.youtube.com/watch?v=R6-PnHODewY&ab_channel=AlgorithmsMadeEasy


 */
public class DeleteAllDuplicates {

    public static ListNode deleteAllDuplicates(ListNode head) {

        HashMap<Integer,Integer> mMap = new HashMap<>();
        ListNode temp = head;
        while(temp != null) {
            if(mMap.containsKey(temp.val))
                mMap.put(temp.val,mMap.get(temp.val) + 1);
            else
                mMap.put(temp.val,1);

            temp = temp.next;
        }


        ListNode prev = new ListNode(0);
        ListNode dummy = prev;


        while(head != null) {
            //System.out.println(head.val + " " + mMap.get(head.val));
            if(mMap.get(head.val) < 2)
            {
                prev.next = head;
                prev  = head;
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
        ListNode three = new ListNode(2);
        //ListNode four = new ListNode(4);

        one.next = two;
        two.next = three;
        // three.next = four;

        ListNode newHead = deleteAllDuplicates(one);

        while(newHead != null)
        {
            System.out.println(newHead.val + " ");
            newHead = newHead.next;
        }
    }

}
