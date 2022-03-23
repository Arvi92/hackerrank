package com.aravind.leetcode.arrays;

import java.util.Arrays;

/*
Without extra space
https://www.youtube.com/watch?v=gmu0RA5_zxs&ab_channel=NickWhite

 */

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        int length = nums.length;
        k = k % length;

        int[] result = new int[nums.length];
        for (int i = 0; i < length; i++) {
            int swapPos = (i+k)%(length);
            result[swapPos] = nums[i];
            print(result);
        }
    }

    public static void print(int[] nums){
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String... args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums,3);
    }
}
