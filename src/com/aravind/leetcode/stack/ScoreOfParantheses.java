package com.aravind.leetcode.stack;

import java.util.Stack;

public class ScoreOfParantheses {
    public static  int scoreOfParentheses(String s) {

        Stack<Character> st = new Stack<>();
        int result = 0;
        int popCnt =0;

        for(int i =0; i< s.length(); i++){

        }
        return result;
    }

    public static void main(String args[]){
        String s = "(()(()))";
        System.out.println(scoreOfParentheses(s));
    }
}
