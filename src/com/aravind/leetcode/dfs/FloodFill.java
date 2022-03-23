package com.aravind.leetcode.dfs;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        return floodFill(image,sr,sc,newColor,image[sr][sc]);

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor,int oldColor) {

        if(sr >=0 && sr<image.length && sc>=0 && sc< image[0].length &&  image[sr][sc] != newColor){
            if(image[sr][sc] == oldColor){
                image[sr][sc] = newColor;
                floodFill(image,sr-1,sc,newColor,oldColor);
                floodFill(image,sr+1,sc,newColor,oldColor);
                floodFill(image,sr,sc-1,newColor,oldColor);
                floodFill(image,sr,sc+1,newColor,oldColor);
            }

        }

        return image;

    }
}
