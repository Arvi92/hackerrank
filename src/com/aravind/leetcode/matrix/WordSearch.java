package com.aravind.leetcode.matrix;

public class WordSearch {

    public static boolean exist(char[][] board, String word) {

        for(int i =0; i< board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(existRecur(board,word,0,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

        public static boolean existRecur(char[][] board, String word,int matchCount, int i, int j) {


            if(i >= board.length || i<0 || j >= board[0].length || j < 0)
                return false;

            boolean result = false;
            if(board[i][j] == word.charAt(matchCount)){
                char original = board[i][j];
                board[i][j] = '.';
                matchCount++;
                if(matchCount == word.length())
                    return true;
                result = existRecur(board,word,matchCount,i+1,j);
                result = result || existRecur(board,word,matchCount,i-1,j);
                result = result || existRecur(board,word,matchCount,i,j+1);
                result = result || existRecur(board,word,matchCount,i,j-1);
                board[i][j] = original;
            }
            return result;


        }

    public static void main(String... args){
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word = "AAB";
        System.out.println(exist(board,word));
    }
}
