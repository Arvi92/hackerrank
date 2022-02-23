package com.aravind.onemonthchallenge.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args)
    {
        Integer[] arr = {45,32,78,44,22,99};

        for(int i=0 ; i< arr.length ; i++)
        {
            for (int j=i+1; j< arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.asList(arr));
        }
    }
}
