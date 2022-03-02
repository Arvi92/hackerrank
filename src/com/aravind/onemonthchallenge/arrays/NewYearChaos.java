package com.aravind.onemonthchallenge.arrays;

import java.util.Arrays;
import java.util.List;

/*

It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
Each person wears a sticker indicating their initial position in the queue from  1 to n.
Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker.
One person can bribe at most two others.

q = [2, 1, 5, 3, 4]
n = 5

Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

 */
public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {

        int bribes = 0;
        Integer[] queue = new Integer[q.size()];
        int index = 0;
        for(Integer k : q)
        {
            queue[index] = k;
            index++;
        }

        int  i = queue.length-1;

        while( i > 0)
        {
            if(queue[i] != i+1)
            {
                if(queue[i-1] == i+1)
                {
                    int temp = queue[i-1];
                    queue[i-1] = queue[i];
                    queue[i] = temp;
                    bribes++;

                }
                else if(queue[i-2] == i+1)
                {


                    int temp = queue[i];
                    queue[i] = queue[i-2];
                    queue[i-2] = queue[i-1];
                    queue[i-1] = temp;
                    bribes = bribes + 2;

                }
                else
                {
                    System.out.println("Too chaotic");
                    return;
                }
            }

//           System.out.println(i + " " + bribes);
//            System.out.println(Arrays.asList(queue));
//            System.out.println();
           i--;

        }
        System.out.println(bribes);
    }

    public static void main(String[] args)
    {
        Integer[] queue = {2,1,5,3,4};
        minimumBribes(Arrays.asList(queue));

    }
}
