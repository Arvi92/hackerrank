package com.aravind.onemonthchallenge.matrix;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1 + 5 + 9 =15
The right to left diagonal = 3 + 5 + 9 =17
Their absolute difference is |15-17| = 2

 */
public class AbsoluteDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        int index =0;
        for(List<Integer> row : arr)
        {
            for(int i=0;i< row.size(); i++)
            {
                if(index == i)
                    leftDiagonalSum += row.get(i);
                if(arr.size()- 1 - index == i)
                {
                    rightDiagonalSum += row.get(i);
                }
            }
            index++;
        }
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

    public static void main(String args[])
    {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(new Integer[]{1,2,3}));
        arr.add(Arrays.asList(new Integer[]{4,5,6}));
        arr.add(Arrays.asList(new Integer[]{9,8,9}));

        int diff = AbsoluteDifference.diagonalDifference(arr);
        System.out.print(diff);
    }
}
