package com.aravind.hackerrank.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {

    public static int findMedian(List<Integer> arr)
    {
        Collections.sort(arr);
        int mid = arr.size()/2;
        return arr.get(mid);
    }

    public static void main(String args[])
    {
        Integer[] arr = {5,3,1,2,4};
        findMedian(Arrays.asList(arr));
    }
}
