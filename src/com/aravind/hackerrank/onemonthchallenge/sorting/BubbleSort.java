package com.aravind.hackerrank.onemonthchallenge.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args)
    {
        Integer[] arr = {5,4,3,2,1};

        int swapCount = 0;
        for(int i=0 ; i< arr.length ; i++)
        {
            for (int j=0; j< arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapCount++;
                }
            }
            System.out.println(Arrays.asList(arr) + " swapCount " + swapCount);

        }
    }
}
