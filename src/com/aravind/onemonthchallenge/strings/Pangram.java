package com.aravind.onemonthchallenge.strings;


import java.util.Arrays;

/*
A pangram is a string that contains every letter of the alphabet.
Given a sentence determine whether it is a pangram in the English alphabet.
Ignore case. Return either pangram or not pangram as appropriate.

s =  "The quick brown fox jumps over a lazy dog"

 */
public class Pangram {

    public static String pangrams(String s) {

        Integer arr[] = new Integer[26];
        Arrays.fill(arr,0);

        for(int i=0; i < s.length(); i++)
        {
            int asciiVal = (int)(s.charAt(i));
            if(asciiVal == 32)
                continue;

            int k =0;

            if(asciiVal < 97)
                k = asciiVal - 65;
            else
                k = asciiVal - 97;

            arr[k] = 1;
        }

        for(int i =0; i< 26;i++)
        {
            if(arr[i] == 0)
                return "not pangram";
        }
        return "pangram";
    }

    public static void main(String args[])
    {
        String s = "The quick brown fox jumps over a lazy dog";
        pangrams(s);
    }
}
