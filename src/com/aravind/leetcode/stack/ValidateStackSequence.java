package com.aravind.leetcode.stack;

/*
Given two integer arrays pushed and popped each with distinct values,
return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1


 */

import java.util.Stack;

public class ValidateStackSequence {

    public static void main(String... args)
    {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {


        int j = 0;

        Stack<Integer> st = new Stack<>();
       for(int k =0; k < pushed.length ;k++){

           st.push(pushed[k]);
           while(j<popped.length && !st.isEmpty() && st.peek() == popped[j]){
               j++;
               st.pop();
           }

       }

       while (!st.isEmpty()){
           int pop = st.pop();
           if(pop != popped[j])
               return false;
           j++;
       }

       return true;

    }
}
