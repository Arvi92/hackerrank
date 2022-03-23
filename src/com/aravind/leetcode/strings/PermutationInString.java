package com.aravind.leetcode.strings;

import java.util.Arrays;
import java.util.HashMap;

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 Input: s1 = "ab", s2 = "eidbaooo"
Output: true

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 */


public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {

        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        Arrays.fill(hash1,0);
        Arrays.fill(hash2,0);

        if(s2.length()<s1.length())
            return false;

        for(int i =0 ; i< s1.length(); i++){
            hash1[s1.charAt(i)-'a']++;
        }

        for(int i =0 ; i< s1.length(); i++){
            hash2[s2.charAt(i)-'a']++;
        }
        if(compare(hash1,hash2))
            return true;

        for(int i = s1.length(); i< s2.length(); i++){

            hash2[s2.charAt(i)-'a']++;
            hash2[s2.charAt(i-s1.length())-'a']--;
            if(compare(hash1,hash2))
                return true;
        }
        return false;
    }

    public static boolean compare(int[] hash1, int[] hash2){
        for(int i =0; i< hash1.length ; i++){
            if(hash1[i] != hash2[i])
                return false;
        }
        return true;
    }

    public static void main(String... args){
        System.out.println(checkInclusion("ab","eidboaoo"));
    }
}
