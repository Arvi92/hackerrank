package com.aravind.hackerrank.onemonthchallenge.logical;

import java.util.ArrayList;
import java.util.List;

public class BombermanGame {


    public static List<String> bomberMan(int n, List<String> grid) {

        char[][] gridMatrix = new char[grid.size()][grid.get(0).length()];
        char[][] bombLocations = new char[grid.size()][grid.get(0).length()];


        for(int i =0; i < grid.size(); i++)
        {
            String row = grid.get(i);
            for(int j =0; j < grid.get(0).length(); j++)
                gridMatrix[i][j] = row.charAt(j);
        }

        for(int k = 2 ; k<=n ; k++)
        {
            if(k%2 == 0) {
                //store bomb locations
                for (int i = 0; i < grid.size(); i++) {
                    String row = grid.get(i);
                    for (int j = 0; j < row.length(); j++) {
                            bombLocations[i][j] = gridMatrix[i][j];
                    }
                }

                //fill entire matrix with bombs
                for (int i = 0; i < grid.size(); i++) {
                    String row = grid.get(i);
                    for (int j = 0; j < grid.get(0).length(); j++) {
                        gridMatrix[i][j] = '0';
                    }

                }
            }
                else
                {
                    for (int i = 0; i < grid.size(); i++)
                    {
                        for (int j = 0; j < grid.get(0).length(); j++)
                        {
                            if (bombLocations[i][j] == '0')
                            {
                                gridMatrix[i][j] = '.';
                                //detonate(gridMatrix[i - 1][j]);
                                if(i-1 >=0)
                                    gridMatrix[i - 1][j] = '.';

                                //detonate(gridMatrix[i + 1][j]);
                                if(i+1 < grid.size())
                                    gridMatrix[i + 1][j] = '.';

                                if(j-1 >=0)
                                    gridMatrix[i][j-1] = '.';

                                if(j+1 < grid.get(0).length())
                                    gridMatrix[i][j+1] = '.';

                                bombLocations[i][j] = '.';
                            }
                        }
                    }
                }
            System.out.println("Grid matrix " + k);
            printMatrix(gridMatrix);

            System.out.println("Bomb matrix");
            printMatrix(bombLocations);
            }

        grid.clear();
        for(int i =0; i < gridMatrix.length ; i++)
        {
            String s = "";
            for(int j =0; j < gridMatrix[0].length ; j++)
            {
                s += gridMatrix[i][j];
            }
            grid.add(s);
        }
        return grid;

    }

    public static void printMatrix (char[][] matrix)
    {
        for(int i =0; i < matrix.length ; i++)
        {
            for(int j =0; j < matrix[0].length ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        List<String> input = new ArrayList<>();
        input.add(".......");
        input.add("...0.0.");
        input.add("....0..");
        input.add("..0....");
        input.add("00...00");
        input.add("00.0...");

        List<String> result = bomberMan(5,input);
        for (String s : result)
        System.out.println(s);


    }
}
