package com.aravind.onemonthchallenge.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending.
Determine if the columns are also in ascending alphabetical order, top to bottom.
Return YES if they are or NO if they are not.

Sample Input

['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']

Sample Output

YES

Explanation

The grid in the  test case can be reordered to

abcde
fghij
klmno
pqrst
uvwxy

 */

public class GridChallenge {

    public static String gridChallenge(List<String> grid)
    {
        int index = 0;
        char[][] sortedMatrix = new char[grid.size()][grid.get(0).length()];
        for(String s : grid)
        {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String newString = new String(temp);
            for(int i=0; i< newString.length(); i++) {
                sortedMatrix[index][i] = newString.charAt(i);

            }
            index++;
        }

        for(int i=0; i< grid.size(); i++) {
            for (int j = 0; j < grid.get(0).length(); j++) {
                System.out.print (sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int columnIndex = 0;
        boolean isColumnSorted = true;
        for(int i=0; i< grid.get(0).length(); i++)
        {
            for(int j=1; j< grid.size(); j++)
            {
                if(sortedMatrix[j][i] < sortedMatrix[0][columnIndex]) {
                    isColumnSorted = false;
                    System.out.println("Failure condition " + i + " " + j);
                }
            }
            columnIndex++;
        }

        return (isColumnSorted ? "YES" : "NO");
    }

    public static void main(String[] args)
    {
        List<String> grid = new ArrayList<>();
        grid.add("abc");
        grid.add("hjk");
        grid.add("mpq");
        grid.add("rtv");
        String result = gridChallenge(grid);
        System.out.println(result);
    }
}
