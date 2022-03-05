package com.aravind.leetcode.arrays;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length+nums2.length];

        int arr1Pointer = 0;
        int arr2Pointer = 0;
        int resultPointer = 0;
        while(arr1Pointer < nums1.length && arr2Pointer < nums2.length)
        {
            if(nums1[arr1Pointer] <= nums2[arr2Pointer])
            {
                result[resultPointer++] = nums1[arr1Pointer++];
            }
            else
            {
                result[resultPointer++] = nums2[arr2Pointer++];
            }
        }
        while(arr1Pointer<nums1.length)
            result[resultPointer++] = nums1[arr1Pointer++];
        while(arr2Pointer<nums2.length)
            result[resultPointer++] = nums2[arr2Pointer++];

        for(int i=0; i< result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int nums1[] = {1,2,3};
        int nums2[] = {2,3,6};

        merge(nums1,nums2);
    }
}
