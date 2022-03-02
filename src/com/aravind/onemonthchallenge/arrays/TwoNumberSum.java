package com.aravind.onemonthchallenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoNumberSum {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Integer input[] = new Integer[arr.size()];

        int index = 0;
        for(Integer i : arr)
        {
            input[index] = i;
            index++;
        }

        int leftIndex =0;
        int rightIndex = input.length -1;
        List<Integer> res = new ArrayList<>();

        while(leftIndex<rightIndex) {
            if (input[leftIndex] + input[rightIndex] == m) {
                res.add(input[leftIndex]);
                res.add(input[rightIndex]);
                return res;
            } else if (input[leftIndex] + input[rightIndex] > m) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return res;
    }

    public static List<Integer> icecreamParlor2(int m, List<Integer> arr) {
        Integer input[] = new Integer[arr.size()];

        int index = 0;
        for(Integer i : arr)
        {
            input[index] = i;
            index++;
        }

        List<Integer> res = new ArrayList<>();

        boolean isFound = false;
        for(int i =0; i< input.length ; i++)
        {
            for(int j =1; j< input.length ; j++)
            {
                if(i != j && (input[i] + input[j] == m) && !isFound)
                {
                    isFound = true;
                    if(i < j)
                    {
                        res.add(i+1);
                        res.add(j+1);

                    }
                    else
                    {
                        res.add(j+1);
                        res.add(i+1);
                    }
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        Integer arr[] = {1,4,5,3,2};
        System.out.println(icecreamParlor(4, Arrays.asList(arr)));

    }
}
