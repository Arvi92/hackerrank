package com.aravind.hackerrank.onemonthchallenge.arrays;

/*

There is a large pile of socks that must be paired by color.
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example

n=7
arr = [1,2,1,2,1,3,2]

There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.


 */

import java.util.Arrays;
import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar)
    {
        Integer freq[] = new Integer[100];
        Arrays.fill(freq,0);

        for(Integer k : ar)
            freq[k-1]++;

        int totalSocks = 0;
        for(int i = 0; i < 100; i++)
            totalSocks += freq[i]/2;

        return totalSocks;
    }

    public static void main(String args[])
    {
        Integer[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(arr.length,Arrays.asList(arr));
        System.out.println(result);
    }
}
