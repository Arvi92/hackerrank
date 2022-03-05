package com.aravind.hackerrank.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.List;

public class EqualStacks {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3)
    {
        Integer[] arr1 = new Integer[h1.size()];
        Integer[] arr2 = new Integer[h2.size()];
        Integer[] arr3 = new Integer[h3.size()];

        for(int i =0; i< arr1.length; i++)
            arr1[i] = h1.get(i);
        for(int i =0; i< arr2.length; i++)
            arr2[i] = h2.get(i);
        for(int i =0; i< arr3.length; i++)
            arr3[i] = h3.get(i);

        int h1CurrentSum = 0;
        int h2CurrentSum = 0;
        int h3CurrentSum = 0;

        for(int i : arr1)
            h1CurrentSum+= i;
        for(int i : arr2)
            h2CurrentSum+= i;
        for(int i : arr3)
            h3CurrentSum+= i;


        int h1Pointer = 0;
        int h2Pointer = 0;
        int h3Pointer = 0;

        int maxSize = Math.max(Math.max(h1.size(),h2.size()), h3.size());
        int minSum;
        for(int i =0; i < maxSize; i++)
        {
            minSum = Math.min(Math.min(h1CurrentSum,h2CurrentSum),h3CurrentSum);
            if((h1CurrentSum == minSum) && h2CurrentSum == minSum && h3CurrentSum == minSum)
            {
                return minSum;
            }

            if(h1CurrentSum > minSum)
            {
                h1CurrentSum = h1CurrentSum - arr1[h1Pointer];
                h1Pointer++;
            }
            if(h2CurrentSum > minSum)
            {
                h2CurrentSum = h2CurrentSum - arr2[h2Pointer];
                h2Pointer++;
            }
            if(h3CurrentSum > minSum)
            {
                h3CurrentSum = h3CurrentSum - arr3[h3Pointer];
                h3Pointer++;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Integer[] arr1 = {3,2,1,1,1};
        Integer[] arr2 = {4,3,2};
        Integer[] arr3 = {1,1,4,1};

        int equalHeight = equalStacks(Arrays.asList(arr1),Arrays.asList(arr2),Arrays.asList(arr3));
        System.out.println(equalHeight);

    }
}
