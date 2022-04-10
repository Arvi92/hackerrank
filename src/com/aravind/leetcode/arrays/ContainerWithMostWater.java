package com.aravind.leetcode.arrays;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int max = 0;

        int left = 0;
        int right = height.length-1;

        while(left < right){
            System.out.println(left + " " + right);
            int height1 = Math.min(height[left] , height[right]) * (right-left);
            max = Math.max(height1,max);
            if(height[left]>height[right])
                right--;
            else
                left++;
        }

        return max;

    }

    public static void main(String... arsfg){
        int[] arr = {2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }
}
