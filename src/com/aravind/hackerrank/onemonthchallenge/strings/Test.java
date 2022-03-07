package com.aravind.hackerrank.onemonthchallenge.strings;

public class Test {

    public static void main(String[] args)
    {
        char i =5;
        if(i ==5)
            System.out.println("yes");
     //   solve(10.25,17,5);
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double totalCost = meal_cost;
        totalCost += ((double)tip_percent/100) * meal_cost;
        totalCost += ((double)tax_percent/100) * meal_cost;
        System.out.print(Math.round(totalCost));

    }
}
