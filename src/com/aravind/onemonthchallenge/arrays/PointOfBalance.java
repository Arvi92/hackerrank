package com.aravind.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.List;

public class PointOfBalance {

    public static String balancedSums(List<Integer> arr)
    {
        int totalSum =0;
        for(Integer i : arr)
            totalSum += i;

        int leftSum =0;
        for(int i =0; i < arr.size() ; i++)
        {
            if(totalSum - leftSum - arr.get(i) == leftSum )
                return "YES";
            leftSum += arr.get(i);
        }
        return "NO";

    }

    public static void main(String[] args)
    {
        Integer[] arr = {5,6,8,11};
        String result = balancedSums(Arrays.asList(arr));
        System.out.println(result);

    }
}
