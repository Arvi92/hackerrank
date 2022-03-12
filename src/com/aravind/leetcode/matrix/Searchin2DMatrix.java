package com.aravind.leetcode.matrix;

/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

Best soln here https://www.youtube.com/watch?v=ZYpYur0znng&ab_channel=takeUforward

start in last column of first row. move down or left based onn the value
 */

public class Searchin2DMatrix {

    public static void main(String... args)
    {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,12));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

            int i = 0;
            int j = matrix[0].length -1;

            while(i < matrix.length && j >=0)
            {
                if(matrix[i][j] == target)
                    return true;
                else if(matrix[i][j] < target)
                    i++;
                else
                    j--;
            }
            return false;
    }
}
