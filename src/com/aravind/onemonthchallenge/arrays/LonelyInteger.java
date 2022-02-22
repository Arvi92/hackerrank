package com.aravind.onemonthchallenge.arrays;

import java.util.*;

/*
Given an array of integers, where all elements but one occur twice, find the unique element.

Example
a = [1,2,3,4,3,2,1]
The unique element is 4.
 */
class LonelyIntegerResult {

    public static int lonelyinteger(List<Integer> a) {

        int lonelyInteger=0;
        Hashtable<Integer,Integer> lookupTable = new Hashtable<>();
        for(Integer number : a)
        {
            int updatedCount = lookupTable.get(number) !=null ? lookupTable.get(number) + 1 : 1;
            lookupTable.put(number,updatedCount);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = lookupTable.entrySet();

        for(Map.Entry<Integer, Integer> entry1 : entrySet)
        {
            if(entry1.getValue() < 2 )
                lonelyInteger = entry1.getKey();
        }
        System.out.print(lonelyInteger);
        return lonelyInteger;
    }

}

public class LonelyInteger {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1,2,3,4,3,2,1);
        int result = LonelyIntegerResult.lonelyinteger(a);

    }
}