package com.aravind.hackerrank.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.List;

/*
You will be given a list of integers,  arr , and a single integer k.
You must create an array of length k from elements of arr such that its unfairness is minimized.
Call that array arr' . Unfairness of an array is calculated as

                max( arr' ) -  min( arr ' )

Where:
- max denotes the largest integer in arr' .
- min denotes the smallest integer in arr'.


Note: Integers in  may not be unique.


 */
public class MinMaxUnfairnessSubArray {

    public static int maxMin(int k, List<Integer> input)
    {
        Integer[] arr = new Integer[input.size()];
        for(int i=0; i< arr.length;i++)
        {
            arr[i] = input.get(i);
        }

        Arrays.sort(arr);

        int minUnfairness = Integer.MAX_VALUE;
        for(int i=0; i<arr.length && k<=arr.length; i++,k++)
        {
            if(arr[k-1] - arr[i] < minUnfairness)
                minUnfairness = arr[k-1] - arr[i];
        }
        return minUnfairness;

    }

    public static void main(String[] args)
    {
        Integer[] input = {1,4,7,2};
        int result = maxMin(2,Arrays.asList(input));
        System.out.println(result);
    }
}
