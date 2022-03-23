package com.aravind.leetcode.strings;

import java.util.HashMap;

/*

Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcbefgh"
Output: 3

 */
public class LongestSubstringWithoutRepeat {

    public static  int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int maxLength = 0;
        int length = 0;
        int start = 0;
        for(int i =0; i< s.length() ; i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                start = start < map.get(c)+1 ? map.get(c)+1 : start;
                map.put(c,i);
            }
            else{
                map.put(c,i);
            }
            length =  (i+1) - start;
            System.out.println(i + " " + start);
            maxLength = Math.max(length,maxLength);

        }
        return maxLength;
    }

    public static void main(String... args){
        System.out.println(lengthOfLongestSubstring("abba"));
    }

}
