package com.aravind.hackerrank.onemonthchallenge.stacks;

import java.util.Stack;

public class BalancedExpression {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;
        for(int i=0;i<s.length();i++)
        {
            Character c = s.charAt(i);
            switch (c)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ']':
                {
                    Character popped = !stack.isEmpty() ? stack.pop() : '0';
                    if(popped == '0' || popped != '[')
                    {
                        isBalanced = false;
                    }
                    break;
                }
                case ')':
                {
                    Character popped = !stack.isEmpty() ? stack.pop() : '0';
                    if(popped == '0' || popped != '(')
                    {
                        isBalanced = false;
                    }
                    break;
                }
                case '}':
                {
                    Character popped = !stack.isEmpty() ? stack.pop() : '0';
                    if(popped == '0' || popped != '{')
                    {
                        isBalanced = false;
                    }
                    break;
                }
            }
        }

        if(!stack.isEmpty())
            isBalanced = false;

        return isBalanced ? "YES" : "NO";
    }

    public static void main(String[] args)
    {
        String s = "}";
        System.out.println(isBalanced(s));
    }
}
