package com.aravind.hackerrank.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.List;

/*
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example
s = [2,2,1,3,2]
d=4
m=2

Lily wants to find segments summing to Ron's birth day, d=4  with a length equalling his birth month,  m=2.
In this case, there are two segments meeting her criteria: [2,2] and [1,3].

 */
public class SubArrayDivision {

    public static int birthday(List<Integer> s, int d, int m)
    {
        int differentWays = 0;
        Integer[] arr = new Integer[s.size()];

        for (int i = 0; i < s.size(); i++)
            arr[i] = s.get(i);

        for(int i=0; i< arr.length ; i++)
        {
            int tmpSum = 0;
            for(int j=i;j<i+m && j<arr.length  ;j++)
            {
                tmpSum += arr[j];
            }
            if(tmpSum == d)
                differentWays++;
        }
        return differentWays;
    }

    public static void main(String args[])
    {
        Integer[] input = {2,2,1,3,2};
        int answer = birthday(Arrays.asList(input),4,2);
        System.out.print(answer);
    }
}
