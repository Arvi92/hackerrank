package com.aravind.onemonthchallenge.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {

        int count = arr.size();
        int positiveCount=0, negativeCount=0, zeroCount =0;
        for(Integer k : arr)
        {
            if(k>0)
                ++positiveCount;
            else if(k<0)
                ++negativeCount;
            else
                ++zeroCount;
        }
        System.out.print( String.format("%.6g%n", (double) positiveCount/count));
        System.out.print( String.format("%.6g%n", (double) negativeCount/count));
        System.out.print( String.format("%.6g%n", (double) zeroCount/count));

    }

}

public class IntegerRatios {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
