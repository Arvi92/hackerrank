package com.aravind.hackerrank.onemonthchallenge.sorting;

public class MergeSort {

    public static void main(String[] args)
    {
        int[] arr = {55,78,33,52,11,67,34};
        mergeSort(arr);
    }

    public static void mergeSort(int[] arr)
    {
       int length = arr.length;
       if(length < 2)
           return;

       int mid = length/2;
       int[] left = new int[mid];
       int[] right = new int[length - mid];

       for(int i=0; i < mid ; i++)
           left[i] = arr[i];
        for(int i=0; i < right.length ; i++)
            right[i] = arr[i+mid];

        System.out.println("");

        mergeSort(left);
        mergeSort(right);

        mergeHalves(arr , left , right);
    }

    public static void mergeHalves(int[] arr, int[] left, int[] right)
    {
        int leftPointer = 0;
        int rightPointer = 0;
        int arrPointer = 0;

        System.out.println("Merging");
        print(left);
        print(right);

        while(leftPointer < left.length && rightPointer < right.length)
        {
            if(left[leftPointer]<right[rightPointer])
                arr[arrPointer++] = left[leftPointer++];
            else
                arr[arrPointer++] = right[rightPointer++];
        }

        while(leftPointer<left.length)
        {
            arr[arrPointer++] = left[leftPointer++];
        }
        while(rightPointer<right.length)
        {
            arr[arrPointer++] = right[rightPointer++];
        }

        System.out.println("Result");
        print(arr);
        System.out.println(" ");
    }

    public static void print(int[] arr)
    {
        for(int i=0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
