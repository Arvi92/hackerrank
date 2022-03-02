package com.aravind.onemonthchallenge.linkedlists;

public class ReverseLinkedListRecursion {

    public static Node reverseRecursion(Node curr)
    {
        System.out.println(curr.val);
        if(curr.next == null)
            return  curr;

        Node next = reverseRecursion(curr.next);
        curr.next.next = curr;
        curr.next = null;

        return next;

    }

    public static void main(String[] args)
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.next = two;
        two.next = three;

        Node newHead = reverseRecursion(one);

        while(newHead !=null)
        {
       //     System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
