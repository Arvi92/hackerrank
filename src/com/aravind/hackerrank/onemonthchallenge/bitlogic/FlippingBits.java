package com.aravind.hackerrank.onemonthchallenge.bitlogic;

/*

You will be given a list of 32 bit unsigned integers. Flip all the bits ( and ) and return the result as an unsigned integer.

n=9
9 = 00000000000000000000000000001001
On flipping
11111111111111111111111111110110 = 4294967286

Example

 */

import java.io.*;

import static java.util.stream.Collectors.joining;

class FlippingBitsResult {


    public static long flippingBits(long n) {

    //    int length = (int)(Math.log(n)/Math.log(2)) + 1;

        long mask = (1L << 32) - 1;
        return n ^ mask;

    }

}

public class FlippingBits {
    public static void main(String[] args) throws IOException {

        long n=9;
        long result = FlippingBitsResult.flippingBits(n);

    }
}
