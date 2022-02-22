package com.aravind.onemonthchallenge.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
There is a collection of input strings and a collection of query strings.
For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

Example
strings = ['ab','ab','abc']
queries = ['ab','abc','bc']

There are  instances of ',  of '' and  of ''. For each query, add an element to the return array, .
 */
class SparseArraysResult {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> occurrences = new ArrayList<>();
        for(String query : queries)
        {
            Integer count = 0;
            for(String str : strings)
            {
                if(str.equals(query))
                    ++count;
            }
            occurrences.add(count);
        }
        return occurrences;
    }

}

public class SparseArrays {
    public static void main(String[] args) throws IOException {

        String[] input1 = {"ab","ab","abc"};
        List<String> strings = Arrays.asList(input1);
        String[] input2 = {"ab","abc","bc"};
        List<String> queries = Arrays.asList(input2);

        List<Integer> res = SparseArraysResult.matchingStrings(strings, queries);


    }
}
