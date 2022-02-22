package com.aravind.onemonthchallenge.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingMatrix
{
    public static void flippingMatrix(List<List<Integer>> matrix)
    {
        Integer[][] matrixArr = new Integer[matrix.size()][matrix.size()];
        for(int i =0; i < matrix.size(); i++)
        {
            for(int j =0; j < matrix.size(); j++)
            {
                matrixArr[i][j] = matrix.get(i).get(j);
            }
        }

        int n = matrix.size()/2;
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=Math.max(Math.max((matrixArr[i][j]),(matrixArr[2*n-1-i][j])), Math.max(matrixArr[i][2*n-1-j], matrixArr[2*n-1-i][2*n-1-j]));
            }
        }
    }

    public static void main(String args[])
    {
        Integer[][] matrix = { { 112,42,83,119}, { 56,125,56,49 },{15,78,101,43},{62,   98,114,108} };

        List<List<Integer>> matrixList = new ArrayList<>();
        for(int i =0; i < matrix.length; i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j =0; j < matrix.length; j++)
            {
                row.add(matrix[i][j]);
            }
            matrixList.add(row);
        }

        flippingMatrix(matrixList);
    }
}
