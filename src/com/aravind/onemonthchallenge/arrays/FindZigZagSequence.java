package com.aravind.onemonthchallenge.arrays;

import java.util.Arrays;

public class FindZigZagSequence {

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n)/2; //modified
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2; //modified
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1; //modified
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7};
        findZigZagSequence(a,7);
    }
}
