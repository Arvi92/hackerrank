package com.aravind.leetcode.arrays;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String... args){

        int arr[] = {1,1,1,2,2,100};

        System.out.println(Arrays.toString(topKFrequent(arr,2)));

    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length ; i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i]) + 1);
            else
                map.put(nums[i],1);
        }

        HashMap<Integer, List<Integer>> result = new HashMap<>();
        Iterator<Integer> iter =  map.keySet().iterator();
        while(iter.hasNext()){
            Integer key = iter.next();
            int val = map.get(key);

            if(result.containsKey(val)){
                List<Integer> existingList = result.get(val);
                existingList.add(key);
                result.put(val,existingList);
            }
            else{
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(key);
                result.put(val,newList);
            }
        }

        int output[] = new int[k];
        int outputIndex = 0;
        boolean isEnd = false;
        for(int i =nums.length; i>0 && !isEnd ;i--){
            if(result.containsKey(i)){
                List<Integer> list = result.get(i);
                for(Integer m : list){
                    output[outputIndex++] = m;
                    System.out.println(outputIndex);
                    if(outputIndex == k) {
                        isEnd = true;
                        break;
                    }
                }
            }
        }
        return output;
    }
}
