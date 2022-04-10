package com.aravind.leetcode.strings;

public class ValidPalindrome {

    public static void main(String... args){
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        return isValid(s,0,0,s.length()-1);
    }

    public static boolean isValid(String s, int removalCount,int left,int right){

        while(left<right)
        {
            if(removalCount > 1)
                return false;

            System.out.println("Comparing " + s.charAt(left) + " " + s.charAt(right));
            if(s.charAt(left) != s.charAt(right)){
                removalCount++;
                return isValid(s, removalCount ,left+1,right) || isValid(s, removalCount ,left,right-1);
            }
            else{
                left++;
                right--;
            }
        }

        if(removalCount > 1)
            return false;

        return true;

    }
}
