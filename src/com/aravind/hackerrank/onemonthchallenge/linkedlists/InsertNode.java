package com.aravind.hackerrank.onemonthchallenge.linkedlists;

public class InsertNode {

    public static Node insertNodeAtPosition(Node llist, int data, int position)
    {

        Node head = llist;
        Node prev = null;
        int index = 0;

        if(position == 0 )
            return head;

        while(index < position )
        {
            prev = llist;
            llist = llist.next;
            index++;
        }
        Node temp = new Node(data);
        temp.next = llist;
        prev.next = temp;

        return head;
    }

    public static void main(String[] args)
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.next = two;
        two.next = three;

        Node result = insertNodeAtPosition(one,4,2);
    }
}
