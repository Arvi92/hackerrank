package com.aravind.leetcode.arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;

        int mid =-1;
        while(left <= right){
            mid = (left + right)/2;
            System.out.println(mid);
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                right = mid-1;
            else
                left = mid +1;
        }

        return nums[mid] < target ? mid+1: mid;
    }

    public static void main(String... args)
    {
        int[] nums = {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(nums,target));
    }
}
