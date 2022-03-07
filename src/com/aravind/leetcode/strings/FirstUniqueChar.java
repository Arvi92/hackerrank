package com.aravind.leetcode.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {

        HashMap<Character,Integer> lookup = new HashMap<>();
        for(int i =0 ; i <s.length(); i++)
        {
            char c = s.charAt(i);
            if(lookup.containsKey(c))
                lookup.put(c, lookup.get(c) + 1);
            else
                lookup.put(c, 1);
        }
        for(int i =0 ; i <s.length(); i++)
        {
            if(lookup.containsKey(s.charAt(i)) && lookup.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(firstUniqChar("aabb"));
    }
}
