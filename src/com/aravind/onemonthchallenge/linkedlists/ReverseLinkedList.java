package com.aravind.onemonthchallenge.linkedlists;

class Node
{
    int val;
    Node next;
    public Node(int val)
    {
        this.val = val;
    }

}
public class ReverseLinkedList {

    public static Node reverse(Node head)
    {
        Node prev = null;
        while(head != null)
        {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        one.next = two;
        two.next = three;

        Node newHead = reverse(one);

        while(newHead !=null)
        {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
