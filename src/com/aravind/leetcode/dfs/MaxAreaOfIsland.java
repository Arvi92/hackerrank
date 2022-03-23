package com.aravind.leetcode.dfs;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        int[][] visited = new int[grid.length][grid[0].length];


        for(int i =0; i< grid.length; i++){
            for(int j=0; j < grid[0].length;j++){
                if(grid[i][j] == 1 && visited[i][j] !=1){
                    int area = findArea(grid,visited,i,j);
                    maxArea = Math.max(area,maxArea);
                }
                visited[i][j] =1;
            }
        }

        return maxArea;

    }

    public int findArea(int[][] grid, int[][] visited,int i,int j){
        int area = 0;
        System.out.print(i +" " + j);
        if( i >=0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1 &&visited[i][j] !=1){
            visited[i][j] = 1;


            area = 1+findArea(grid,visited,i+1,j) + findArea(grid,visited,i-1,j) + findArea(grid,visited,i,j+1) + findArea(grid,visited,i,j-1);
        }
        return area;
    }
}
