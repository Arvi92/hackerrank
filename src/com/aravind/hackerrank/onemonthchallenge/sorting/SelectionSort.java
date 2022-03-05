package com.aravind.hackerrank.onemonthchallenge.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args)
    {
        Integer[] arr = {5,4,3,2,1};

        int swapCount = 0;
        for(int i=0 ; i< arr.length ; i++)
        {
            int minIndex = i;
            for (int j=minIndex+1; j< arr.length; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            swapCount++;

            System.out.println(Arrays.asList(arr) + " swapCount " + swapCount);
        }
    }
}
