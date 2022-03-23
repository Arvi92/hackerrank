package com.aravind.leetcode.stack;

import java.util.Stack;

public class MinimumParanthesesRemoval {

    public static String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        char arr[] = s.toCharArray();

        for(int i =0; i < arr.length ; i++){
            if(arr[i] == '(')
                stack.push(-1 * i);
            else if (arr[i] == ')'){
                if(!stack.isEmpty() && stack.peek() <=0)
                    stack.pop();
                else if(stack.isEmpty())
                    arr[i] = 'A';
            }
        }

        while(!stack.isEmpty()){
            Integer k = stack.pop();
            k = -1 * k;
            arr[k] = 'A';
        }


        StringBuilder sb = new StringBuilder("");
        for(int i =0; i < arr.length ; i++){
            if(arr[i] != 'A')
                sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main(String... args){
        String s = "())()(((";
        System.out.println(minRemoveToMakeValid(s));

    }
}
