package com.aravind.hackerrank.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {
    public static void maxSubarray(List<Integer> arr) {

        Integer[] input = new Integer[arr.size()];
        for(int i=0; i<input.length;i++)
        {
            input[i] = arr.get(i);
        }

        int maxTillHere = 0;
        int globalMax = input[0];
        int maxSS = input[0];

        for(int i=0; i<input.length;i++)
        {
            maxTillHere = maxTillHere + input[i];

            if(maxTillHere > globalMax)
                globalMax = maxTillHere;

            if(maxTillHere < 0)
                maxTillHere = 0;

            maxSS = Math.max(Math.max(maxSS, input[i]), maxSS + input[i]);

        }

        System.out.println(maxSS);

    }

    public  static void main(String[] args)
    {
        Integer[] arr = {-2,-3,-1,-4,-6};
        maxSubarray(Arrays.asList(arr));

    }
}
