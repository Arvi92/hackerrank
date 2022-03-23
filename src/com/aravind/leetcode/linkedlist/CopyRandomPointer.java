package com.aravind.leetcode.linkedlist;


import java.util.HashMap;

/*
Better solution
https://www.youtube.com/watch?v=VNf6VynfpdM&ab_channel=takeUforward

 */
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyRandomPointer {

    public static Node copyRandomList(Node head) {

        if(head == null)
            return head;

        HashMap<Node,Node> map = new HashMap<Node,Node>();

        Node temp = head;
        Node prev = null;
        while(temp != null)
        {
            Node newNode = new Node(temp.val);
            if(prev != null)
                prev.next = newNode;
            prev = newNode;
            map.put(temp,newNode);
            temp = temp.next;
        }

        System.out.println(map);

        Node temp2 = head;
        while(head != null)
        {
            Node random = head.random;
            Node newNode = map.get(head);
            Node newRandom = map.get(random);
            newNode.random = newRandom;
            head = head.next;
        }

        System.out.println();
        return map.get(temp2);
    }

    public static void main(String... args)
    {
        Node one  = new Node(7);
        Node two  = new Node(13);
        Node three  = new Node(11);
        Node four  = new Node(10);
        Node five  = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        two.random = one;
        three.random = five;
        four.random = three;
        five.random = one;

        System.out.println(copyRandomList(one));
    }
}
