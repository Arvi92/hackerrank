package com.aravind.leetcode.dynamicprogramming;

public class HouseRobberII {

    //4 3 3 5
    public static int rob(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);

        int nums1[] = new int[nums.length];
        for(int i =0 ; i<  nums.length ; i++){
            nums1[i] = nums[i];
        }
        //int sum1 =0;
        int sum1 = robSegment(nums,0,nums.length-2);
        int sum2 = robSegment(nums1,1,nums1.length-1);
        System.out.println(sum1 + " " + sum2);
       // int sum2 =0;

        return Math.max(sum1,sum2);

    }

    public static int robSegment(int[] nums,int start, int end) {


        for(int i = end-2; i>=start; i--){
            int sum1 = (i+2 >end) ? 0 : nums[i+2];
            int sum2 = (i+3 >end) ? 0 : nums[i+3];
            nums[i] += Math.max(sum1,sum2);
        }
        return Math.max(nums[start],nums[start+1]);
    }

    public static void main(String... args){
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

}

