package com.aravind.leetcode.arrays;


/*
https://www.youtube.com/watch?v=PN68qx-Qkdw&ab_channel=NickWhite
 */
public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {



        int left = 0;
        int right = nums.length -1;

        int negativeIndex = 0;
        while (left<=right)
        {
            int mid = (right+left)/2;
            if(nums[mid] < 0 && nums[mid+1] >= 0){
                negativeIndex = mid;
                break;
            }
            else if(nums[mid] >= 0){
                right = mid -1;
            }
            else
                left = mid +1;

            //System.out.println(mid);
        }


        int positiveIndex = negativeIndex +1;

        int[] result = new int[nums.length];
        int resultPointer = 0;
        while(positiveIndex < nums.length && negativeIndex >=0)
        {
//            System.out.println(nums[positiveIndex]);
//            System.out.println(nums[negativeIndex]);
//            System.out.println();
            if(nums[positiveIndex] * nums[positiveIndex] < nums[negativeIndex] * nums[negativeIndex]){
                result[resultPointer] = nums[positiveIndex] * nums[positiveIndex];
                positiveIndex++;
            }
            else{
                result[resultPointer] = nums[negativeIndex] * nums[negativeIndex];
                negativeIndex--;
            }
            resultPointer++;
        }

        while(positiveIndex < nums.length){
            result[resultPointer++] = nums[positiveIndex] * nums[positiveIndex];
            positiveIndex++;
        }

        while(negativeIndex >=0){
            result[resultPointer++] = nums[negativeIndex] * nums[negativeIndex];
            negativeIndex--;
        }

        return  result;

    }

    public static void main(String... args)
    {
        int[] nums = {-7,-3,2,3,11};
        nums = sortedSquares(nums);
        for(int i : nums)
            System.out.print(i + " ");
    }
}
