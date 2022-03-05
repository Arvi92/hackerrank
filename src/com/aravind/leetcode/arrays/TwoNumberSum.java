package com.aravind.leetcode.arrays;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        int leftPointer =0;
        int rightPointer = nums.length-1;
        while(leftPointer<rightPointer)
        {
            int sum = nums[leftPointer] + nums[rightPointer];
            if(sum == target)
                break;
            else if(sum > target)
                rightPointer--;
            else
                leftPointer++;
        }

        int result[] = new int[2];
        result[0] = leftPointer;
        result[1] = rightPointer;
        return result;
    }

    public static void main(String[] args)
    {
        int nums[] = {3,2,4};
        int target = 6;
        twoSum(nums,target);

    }
}
