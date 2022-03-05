package com.aravind.hackerrank.onemonthchallenge.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args)
    {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int start, int end)
    {
        int pivot = end;
        int pIndex = start;

        if(start >= end)
            return;

        System.out.println("Sorting from " + start + " to " + end);
        for(int i=start; i<= end; i++)
        {
            if(arr[i] < arr[pivot])
            {
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex++;
            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[pivot];
        arr[pivot] = temp;
        pivot = pIndex;

        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);

    }
}
