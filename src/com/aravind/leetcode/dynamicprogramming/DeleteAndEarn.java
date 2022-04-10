package com.aravind.leetcode.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn {

    public static int deleteAndEarn(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], nums[i] + map.get(nums[i]));
            }
            else
                map.put(nums[i],nums[i]);
        }

        int freq[] = new int[map.size()];
        int index =0;
        for(Integer i : map.keySet()) {
            freq[index++] = i;
        }

        Arrays.sort(freq);

        System.out.println(Arrays.toString(freq));
        int result[] = new int[freq.length];
        int val = 0;
        for(int i =0; i< freq.length; i++){

            int prev1 = (i>0) ? result[i-1] : 0;
            int prev2 = (i>1) ? result[i-2] : 0;
            if( i > 0 && freq[i] - freq[i-1] > 1)
                val = Math.max(prev1,map.get(freq[i]) + prev1);
            else if(i == 0)
                val = map.get(freq[i]);
            else if(i > 0 && freq[i] - freq[i-1] == 1)
                val = Math.max(prev1,map.get(freq[i]) + prev2);

            System.out.println(Arrays.toString(result));
            System.out.println();
            result[i] = val;


        }
        return result[result.length-1];
    }

    public static void main(String... args){
        int nums[] = {1,2,3,15,16,17,18};
        System.out.println(deleteAndEarn(nums));
    }
}
