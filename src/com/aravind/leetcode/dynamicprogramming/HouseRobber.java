package com.aravind.leetcode.dynamicprogramming;

// 2 1 1 2
public class HouseRobber {
//        public static int rob(int[] nums) {
//
//            if(nums.length == 1)
//                return nums[0];
//
//            int sum1 = nums[0] + robRecur(nums,2,nums.length-1);
//            int sum2 = nums[1] + robRecur(nums,3,nums.length-1);
//
//            return Math.max(sum1,sum2);
//        }
//
//        public static int robRecur(int[] nums,int start,int end){
//            if(start > end)
//                return 0;
//            if(start == end)
//                return nums[start];
//
//
//            int sum1 = nums[start] + robRecur(nums,start+2,nums.length-1);
//            int sum2 = nums[start+1] + robRecur(nums,start+3,nums.length-1);
//
//            return Math.max(sum1,sum2);
//        }



    public static int rob(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        for(int i = nums.length-3; i>=0; i--){
            int sum1 = (i+2 >nums.length-1) ? 0 : nums[i+2];
            int sum2 = (i+3 >nums.length-1) ? 0 : nums[i+3];
            nums[i] += Math.max(sum1,sum2);
        }
        return Math.max(nums[0],nums[1]);
    }

        public static void main(String... args){
            int[] nums = {2,1,1,2};
            System.out.println(rob(nums));
        }
}
