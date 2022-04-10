package com.aravind.greedy;

import java.util.Arrays;

public class TwoCityScheduling {

    public static void main(String... args){

        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(twoCitySchedCost(costs));
    }

    public static int twoCitySchedCost(int[][] costs) {

        int cost = 0;
        Arrays.sort(costs, (a, b) -> {
            return a[1] - a[0] - (b[1] - b[0]);
        });

        for(int i=0; i < costs.length; i++){
            System.out.print(costs[i][0] + " ");
        }

        for(int i=0; i < costs.length; i++){
            if(i<costs.length/2)
                cost += costs[i][1];
            else
                cost += costs[i][0];
        }
        return cost;
    }
}