package com.aravind.leetcode.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class StoneWeight {

    public static int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0; i< stones.length; i++){
            pq.add(stones[i]);
        }

        while(!pq.isEmpty()){
            if(pq.size() == 1)
            {
                return pq.remove();
            }

            int one = pq.remove();
            int two = pq.remove();
            int diff= Math.abs(one-two);
            if(diff != 0)
            {
                pq.add(diff);
            }
        }


        return 0;

    }

    public static void main(String[] args){
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));

    }
}
