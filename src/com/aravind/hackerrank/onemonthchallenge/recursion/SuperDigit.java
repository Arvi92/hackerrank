package com.aravind.hackerrank.onemonthchallenge.recursion;

public class SuperDigit {

    public static int superDigit(String n, int k)
    {
        String newString = n;
        for(int i=1; i < k; i++)
        {
            newString = newString + n;
        }

        return (int) findRecursiveSum(newString);

    }

    public static long findRecursiveSum(String n)
    {
        long sum =0;
        for(int i=0; i < n.length();i++)
        {
            sum += Integer.parseInt(n.charAt(i) + "");
        }

        if(sum/10 > 0)
            return findRecursiveSum(sum + "");
        return sum;
    }

    /*
    public static long findRecursiveSum(long n)
    {
        long sum = 0;

        while(n != 0) {
            sum += n % 10;
            if(n/10 > 0)
                n = n/10;
            else
            {
                n=0;
            }
        }
        if(sum/10 > 0 )
            return findRecursiveSum(sum);
        return sum;
    }
    */



    public static void main(String[] args)
    {
        int result = superDigit("148",3);
        System.out.println(result);
    }
}
