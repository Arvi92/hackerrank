package com.aravind.hackerrank.onemonthchallenge.bitlogic;

/*
Given an integer n, find each x such that:

0<=x<=n
n +x = n ^ x

where ^ denotes the bitwise XOR operator. Return the number of x's satisfying the criteria.

 */

public class SumvsXOR {

    public static long sumXor(long n)
    {
        int count = 0;
        if(n ==0)
            return 1;
        for(long i=0; i< n; i++)
        {
            long s = i ^ n;
            if(i + n == s)
                count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(sumXor(1000000000000000L));
    }


}



/*

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int zeroCount = 0;
        while (n>0) {
            if (n%2==0)
                zeroCount++;
            n/=2;
        }
        System.out.println(1l<<zeroCount);
    }
}

 */
