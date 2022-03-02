package com.aravind.onemonthchallenge.strings;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;


public class SherlockString {

    public static void main(String[] args) throws Exception {
        new SherlockString().run();
    }


    private void run() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().trim().toCharArray();
        int[] cnt = new int[26];
        for (char c : s) {
            cnt[c - 'a']++;
        }

        Arrays.sort(cnt);

        int cntMin = 0;
        int cntMax = 0;

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0) {
                min = Math.min(min, cnt[i]);
                max = Math.max(max, cnt[i]);
            }
        }

        //System.out.println(Arrays.toString(cnt));

        //System.out.println(min);
        //System.out.println(max);

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0) {
                cntMin += Math.abs(min - cnt[i]);
            }
            if (cnt[i] < max) {
                cntMax += cnt[i];
            }
        }

        //System.out.println(cntMin);
        //System.out.println(cntMax);

        System.out.println(cntMin <= 1 || cntMax <= 1 ? "YES" : "NO");
    }


}