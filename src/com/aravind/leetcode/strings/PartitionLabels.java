package com.aravind.leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.


Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]

 */
public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {

        HashMap<Character,Integer> lastIndexMap = new HashMap<>();
        for(int i =0;i<s.length(); i++){
            Character c = s.charAt(i);
            lastIndexMap.put(c,i);
        }


        int curr = 0;
        int end = lastIndexMap.get(s.charAt(0));
        int segLength =1;
        List<Integer> result = new ArrayList<>();

        while(curr < s.length()){
            Character c = s.charAt(curr);
            if(lastIndexMap.get(c)>end){
                end = lastIndexMap.get(c);
            }
            if(curr == end){
                result.add(segLength);
                segLength =0;
            }
            curr++;
            segLength++;
        }

        return result;

    }

    public static void main(String args[]){
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
