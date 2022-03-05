package com.aravind.leetcode.arrays;

public class BuySellStock {

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        for(int i=prices.length-1;i>0;i--)
        {
            int n = i-1;
            while(n>=0)
            {
                if(prices[i] - prices[n] > maxProfit) {
                    maxProfit = prices[i] - prices[n];
                }
                else if(prices[i] - prices[n] < 0)
                {

                    i = n+1;
                    break;
                }
                n--;
            }
        }
        return maxProfit;

    }

    public static int maxProfit2(int[] prices) {

        int maxProfit = 0;
        int minValue = prices[0];

        for(int i =0; i< prices.length; i++)
        {
            minValue = Math.min(minValue,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }

        return maxProfit;
    }

    public static void main(String[] args)
    {
        int[] s ={7,1,5,3,6,4};
        System.out.println(maxProfit2(s));
    }
}
