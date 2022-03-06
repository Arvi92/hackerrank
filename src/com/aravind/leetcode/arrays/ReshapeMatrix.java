package com.aravind.leetcode.arrays;

public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int matrixRows = mat.length;
        int matrixColumns = mat[0].length;

        if(matrixRows * matrixColumns != r * c)
        {
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];
        int rowPtr = 0;
        int columnPtr = 0;
        for(int i=0;i<r;i++)
        {
            for(int j=0; j<c; j++)
            {
                if(columnPtr < matrixColumns)
                {
                    reshapedMatrix[i][j] = mat[rowPtr][columnPtr];
                    columnPtr++;
                }
                else
                {
                    columnPtr=0;
                    rowPtr++;
                    reshapedMatrix[i][j] = mat[rowPtr][columnPtr];
                    columnPtr++;
                }
            }
        }
        return reshapedMatrix;

    }

    public static void main(String[] args)
    {
        int[][] mat = {{1,2},{3,4}};
        int[][] result = matrixReshape(mat,1,4);
    }
}
