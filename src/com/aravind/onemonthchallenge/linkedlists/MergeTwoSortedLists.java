package com.aravind.onemonthchallenge.linkedlists;

public class MergeTwoSortedLists {

    public static Node mergeLists(Node head1, Node head2)
    {

        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        Node temp = null;
        Node result = null;
        Node newhead = null;
        while(head1 != null && head2 != null)
        {
            if(head1.val < head2.val) {
                result = head1;
                head1 = head1.next;
            }
            else {
                result = head2;
                head2 = head2.next;
            }

            if(temp == null) {
                temp = result;
                newhead = temp;

            }
            else
            {
                temp.next = result;
                temp = temp.next;
            }
        }

        while(head1 != null)
        {
            temp.next = head1;
            temp = head1;
            head1 = head1.next;
        }

        while(head2 != null)
        {
            temp.next = head2;
            temp = head2;
            head2 = head2.next;
        }
        return newhead;
    }

    public static void main(String[] args)
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.next = two;
        two.next = three;

        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        four.next = five;
        five.next = six;


        print(mergeLists(one,four));
    }

    public static void print(Node head)
    {
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
