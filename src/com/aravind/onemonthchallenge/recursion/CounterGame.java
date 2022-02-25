package com.aravind.onemonthchallenge.recursion;


/*

Louise and Richard have developed a numbers game.
They pick a number and check to see if it is a power of 2.
If it is, they divide it by .
If not, they reduce it by the next lower number which is a power of 2.
Whoever reduces the number to 1 wins the game. Louise always starts.

Given an initial value, determine who wins the game.

Example

n=132
It's Louise's turn first. She determines that 132 is not a power of 2.
The next lower power of  is 128, so she subtracts that from 132 and passes 4 to Richard.
4 is a power of 2, so Richard divides it by 2 and passes 2 to Louise.
Likewise, 2 is a power so she divides it by 2 and reaches 1. She wins the game.

Sample Input

6

Sample Output

Richard
 */
public class CounterGame {

    public static String counterGame(long n, int moveCount)
    {
        int k=1;
        if(n==1)
        {
            return determineWinner(moveCount);
        }
        while(Math.pow(2,k) < n)
        {
            k = k + 1;
        }
       if(Math.pow(2,k) == n) {
            n = n / 2;
            return counterGame(n,++moveCount);
        }
       else
       {
           k -= 1;
           return counterGame(n - (long)Math.pow(2,k),++moveCount);
       }

    }

    public static String determineWinner(int moveCount)
    {
        System.out.println(moveCount);
        return (moveCount %2 ==0) ? "Richard" : "Louise";
    }

    public static void main(String args[])
    {
        System.out.println(counterGame(6,0));
    }
}
