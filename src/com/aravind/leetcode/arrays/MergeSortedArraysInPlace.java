package com.aravind.leetcode.arrays;

public class MergeSortedArraysInPlace {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        int arr1Pointer = nums1.length - nums2.length -1;
        int arr2Pointer = nums2.length - 1;

        int resultPointer = nums1.length-1;
        while(arr1Pointer >= 0 && arr2Pointer >= 0)
        {
            if(nums1[arr1Pointer] >= nums2[arr2Pointer])
            {
                nums1[resultPointer--] = nums1[arr1Pointer--];
            }
            else
            {
                nums1[resultPointer--] = nums2[arr2Pointer--];
            }
            for(int i=0; i< nums1.length; i++)
            {
                System.out.print(nums1[i] + " ");
            }
        }

        while(arr1Pointer>0)
            nums1[resultPointer--] = nums1[arr1Pointer--];
        while(arr2Pointer>=0)
            nums1[resultPointer--] = nums2[arr2Pointer--];
        for(int i=0; i< nums1.length; i++)
        {
            System.out.print(nums1[i] + " ");
        }

    }

    public static void main(String[] args)
    {
        int nums1[] = {2,0};
        int nums2[] = {1};

        merge(nums1,0,nums2,0);
    }

}
