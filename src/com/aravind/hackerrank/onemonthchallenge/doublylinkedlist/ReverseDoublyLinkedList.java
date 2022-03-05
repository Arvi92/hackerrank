package com.aravind.hackerrank.onemonthchallenge.doublylinkedlist;

class DoublyLinkedListNode
{
     int data;
     DoublyLinkedListNode next;
     DoublyLinkedListNode prev;

    DoublyLinkedListNode(int data)
    {
        this.data = data;
    }
}

public class ReverseDoublyLinkedList {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode prev = null;
       while(llist != null)
       {
           DoublyLinkedListNode temp =  llist.next;
           llist.next = prev;
           llist.prev = temp;
           prev = llist;
           llist = temp;
       }
       return prev;
    }

    public static void main(String[] args)
    {
        DoublyLinkedListNode one = new DoublyLinkedListNode(1);
        DoublyLinkedListNode two = new DoublyLinkedListNode(2);
        DoublyLinkedListNode three = new DoublyLinkedListNode(3);

        one.next = two;
        one.prev = null;

        two.next = three;
        two.prev = one;

        three.next = null;
        three.prev = two;

        System.out.println(reverse(one).data);

    }

}
