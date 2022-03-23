package com.aravind.leetcode.logic;

public class IsBadVersion {
    public static int binarySearch(int l, int r){
        if(l<=r){
            int mid = l +(r-l)/2;
            if(isBadVersion(mid)){
                if(mid==0)
                    return 0;
                if(!isBadVersion(mid-1))
                    return mid;
                return binarySearch(l,mid-1);
            }
            return binarySearch(mid+1,r);
        }
        return -1;
    }
    public static int firstBadVersion(int n) {
        return binarySearch(1,n);
    }

    public static boolean isBadVersion(int n){
            if(n>=4)
                return true;
            return false;
    }

    public static void main(String... args){
        System.out.println(firstBadVersion(5));
    }

}

// 1 2 3 4 5
//4