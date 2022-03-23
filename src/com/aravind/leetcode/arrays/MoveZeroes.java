package com.aravind.leetcode.arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int nonZeroptr = 0;

        for(int i=0; i< nums.length ; i++)
        {
            if(nums[i] !=0)
            {
                nums[nonZeroptr] = nums[i];
                nonZeroptr++;
            }
        }
        while(nonZeroptr < nums.length)
            nums[nonZeroptr++] =0;
        print(nums);
    }

    public static void print(int nums[])
    {
        for(int i =0; i< nums.length; i++)
            System.out.print(nums[i] + " ");

        System.out.println();
    }

    public static void main(String... args)
    {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
