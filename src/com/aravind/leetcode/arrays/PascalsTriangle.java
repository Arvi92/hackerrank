package com.aravind.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {


        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        int index = 1;
        while(index <= numRows)
        {
            List<Integer> current = new ArrayList<>();
            for(int i =0; i< index; i++)
            {
                if(i ==0 || i == index-1)
                {
                    current.add(1);
                }
                else
                {
                    current.add(prev.get(i-1) + prev.get(i));
                }
            }
            prev = current;
            result.add(current);
            index++;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(generate(5));
    }
}
