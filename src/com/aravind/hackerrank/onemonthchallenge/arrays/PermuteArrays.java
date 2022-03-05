package com.aravind.hackerrank.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*

There are two n-element arrays of integers  A and B.
Permute them into some array A`  and B` such that the relation A`[i] + B`[i]  holds for all i where 0<= i <=n.

Return YES if some permutation, satisfies the relation exists.
Otherwise, return NO.

 */
public class PermuteArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        Collections.sort(A);

        Collections.sort(B);
        Collections.reverse(B);

        for(int i=0; i< A.size();i++)
        {
            if(A.get(i) + B.get(i) < k)
                return "NO";
        }
        return "YES";
    }

    public static void main(String args[])
    {
        Integer[] A = {1,2,2,1};
        Integer[] B = {3,3,3,4};
        String result = twoArrays(5, Arrays.asList(A), Arrays.asList(B));
        System.out.print(result);
    }
}
