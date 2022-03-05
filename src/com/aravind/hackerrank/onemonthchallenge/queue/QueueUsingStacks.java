package com.aravind.hackerrank.onemonthchallenge.queue;


import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {

    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void enqueue(Integer k)
    {
        stack1.push(k);
    }

    public static Integer dequeue()
    {
        while(!stack1.empty())
            stack2.push(stack1.pop());
        Integer data  = stack2.pop();
        while(!stack2.empty())
            stack1.push(stack2.pop());
        return data;
    }

    public static void print()
    {
        while(!stack1.empty())
        {
            stack2.push(stack1.pop());
        }
        while(!stack2.empty())
        {
            Integer val = stack2.pop();
            stack1.push(val);
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void printFirstElement()
    {
        while(!stack1.empty())
        {
            Integer val = stack1.pop();
            stack2.push(val);
        }
        System.out.println(stack2.peek());
        while(!stack2.empty())
        {
            Integer val = stack2.pop();
            stack1.push(val);
        }
        //System.out.println();
    }


    public static void main(String[] args)
    {

//        Long[] arr = {1L,2L,3L,4L,5L};
//        for(Long i : arr)
//        {
//            stack1.push(i);
//        }
//
//        enqueue(6L);
//        print();
//
//        dequeue();
//        print();

        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();

        while(queries > 0)
        {
            int queryType = scan.nextInt();
            if(queryType == 1) {
                int queryVal = scan.nextInt();
                enqueue(queryVal);
            }
            else if(queryType ==2)
            {
                dequeue();
            }
            else if(queryType == 3)
            {
                printFirstElement();
            }
            queries--;
        }

        scan.close();

    }
}
