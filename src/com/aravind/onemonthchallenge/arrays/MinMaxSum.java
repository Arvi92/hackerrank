package com.aravind.onemonthchallenge.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
arr = [1,3,5,7,9]
Example

The minimum sum is 16 and the maximum sum is .24 The function prints

16 24

Input Format

A single line of five space-separated integers.
 */

class MinMaxSumResult {

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum=0,maxSum=0;

        for(Integer curr : arr)
            totalSum += curr;

        long minSum = totalSum;
        for(Integer curr : arr){
            if(totalSum-curr > maxSum)
                maxSum = totalSum-curr;
            if(totalSum-curr < minSum)
                minSum = totalSum-curr;
        }
        System.out.print(minSum + " " + maxSum);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MinMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
