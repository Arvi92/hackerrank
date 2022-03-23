package com.aravind.leetcode.strings;

import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {

        String[] tokens = path.split("/+");

        Stack<String> stack = new Stack<>();

        for(String s: tokens){
            if(s.equals("..") && !stack.isEmpty())
                stack.pop();
            else if(s.equals(".") || s.equals(""))
                continue;
            else
                stack.push(s);
        }

        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            result.insert(0,"/" + stack.pop());
        }

        return result.toString().equals("") ? "/": result.toString() ;
    }

    public static void main(String... args)
    {
        System.out.println(simplifyPath("/..//avs/dsf"));
    }
}
