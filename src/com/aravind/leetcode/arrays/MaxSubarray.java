package com.aravind.leetcode.arrays;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int sumTillIndex = 0;

        for(int i=0; i< nums.length; i++)
        {
            sumTillIndex = sumTillIndex + nums[i];

            if(sumTillIndex > maxSum)
                maxSum = sumTillIndex;

            if(sumTillIndex < 0)
                sumTillIndex = 0;
        }
        return maxSum;
    }

    public static void main(String[] args)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
