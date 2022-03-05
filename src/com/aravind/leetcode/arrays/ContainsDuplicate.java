package com.aravind.leetcode.arrays;

import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> values = new HashMap<>();

        for(int i=0; i< nums.length; i++)
        {
            if(values.containsKey(nums[i]))
                return true;
            else
                values.put(nums[i],1);
        }
        return false;

    }

    public static void main(String[] args)
    {

        int[] nums = {1,2,3,1,2};
        containsDuplicate(nums);
    }
}
