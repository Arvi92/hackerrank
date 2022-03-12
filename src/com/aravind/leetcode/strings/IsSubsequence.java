package com.aravind.leetcode.strings;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if(s.equals(""))
            return true;
        if(t.equals(""))
            return false;
        int sPointer = 0;

        for(int i =0; i < t.length(); i++)
        {
            Character c = t.charAt(i);
            if(sPointer< s.length() && s.charAt(sPointer) == c)
            {
                sPointer++;
            }
        }

        if(sPointer == s.length())
            return true;
        return false;

    }

    public static void main(String[] args)
    {
        System.out.println(isSubsequence("b","abc"));
    }
}
