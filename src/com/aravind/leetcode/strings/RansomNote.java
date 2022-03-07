package com.aravind.leetcode.strings;

import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> magazineMap = new HashMap<>();
        HashMap<Character,Integer> ransomNoteMap = new HashMap<>();

        for(int i =0 ; i <ransomNote.length(); i++)
        {
            char c = ransomNote.charAt(i);
            if(ransomNoteMap.containsKey(c))
                ransomNoteMap.put(c, ransomNoteMap.get(c) + 1);
            else
                ransomNoteMap.put(c, 1);
        }

        for(int i =0 ; i <magazine.length(); i++)
        {
            char c = magazine.charAt(i);
            if(magazineMap.containsKey(c))
                magazineMap.put(c, magazineMap.get(c) + 1);
            else
                magazineMap.put(c, 1);
        }

        for(int i =0 ; i <ransomNote.length(); i++)
        {
            char c = ransomNote.charAt(i);
            int ransomNoteCount = ransomNoteMap.get(c);
            if(magazineMap.get(c) == null)
                return false;
            else if(magazineMap.get(c) < ransomNoteCount)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(canConstruct("aa","ab"));
    }
}
