package com.aravind.leetcode.matrix;

// Better soln at Nick White youtube channel
// Use hashset and traverse only once
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        for(int i =0; i<9;i++)
        {
            int[] lookup = {1,2,3,4,5,6,7,8,9};
            for(int j=0;j<9;j++)
            {
                if(board[i][j] == '.')
                    continue;
                int value = Integer.parseInt(board[i][j] + "");
                if(value > 9 || value < 0 || lookup[value-1] == 0)
                {
                    return false;
                }
                if(lookup[value-1] == value)
                {
                    lookup[value-1] =0;
                }
            }
        }

        for(int i =0; i<9;i++)
        {
            int[] lookup = {1,2,3,4,5,6,7,8,9};
            for(int j=0;j<9;j++)
            {
                if(board[j][i] == '.')
                    continue;
                int value = Integer.parseInt(board[j][i] + "");
                if(value > 9 || value < 0 || lookup[value-1] == 0)
                {
                    return false;
                }
                if(lookup[value-1] == value)
                {
                    lookup[value-1] =0;
                }
            }
        }


        int count = 1;
        int rowPtr = 0;
        int columnPtr = 0;
        int currMatRowStart = 0;
        int currMatColumnStart = 0;
        int[] lookup = {1,2,3,4,5,6,7,8,9};
        while(count <= 81)
        {

            if(board[rowPtr][columnPtr] != '.') {
                int value = Integer.parseInt(board[rowPtr][columnPtr] + "");
                if (value > 9 || value < 0 || lookup[value - 1] == 0) {
                    return false;
                }
                if (lookup[value - 1] == value) {
                    lookup[value - 1] = 0;
                }
            }

            if(count % 27 == 0)
            {
                currMatRowStart = currMatRowStart + 3;
                rowPtr = currMatRowStart;
                currMatColumnStart = 0;
                columnPtr = 0;
                for(int i=0; i <9; i++)
                    lookup[i] = i+1;
            }
            else if(count % 9 == 0)
            {
                currMatColumnStart = currMatColumnStart + 3;
                columnPtr = currMatColumnStart;
                rowPtr = currMatRowStart;
                for(int i=0; i <9; i++)
                    lookup[i] = i+1;
            }
            else if(count % 3 == 0)
            {
                rowPtr++;
                columnPtr = currMatColumnStart;
            }
            else
            {
                columnPtr++;
            }

            count++;

        }
        return true;
    }

    public static void main(String[] args)
    {
        char board[][] = {{'.','.','4','.','.','.','6','3','.'},{'.','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},{'4','.','3','.','.','.','.','.','1'},{'.','.','.','7','.','.','.','.','.'},{'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(board));
    }
}
