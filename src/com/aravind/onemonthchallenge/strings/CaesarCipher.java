package com.aravind.onemonthchallenge.strings;

/*

Julius Caesar protected his confidential information by encrypting it using a cipher.
Caesar's cipher shifts each letter by a number of letters.
If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc

 */

public class CaesarCipher {

    public static String caesarCipher(String s, int k)
    {
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0; i < s.length(); i++)
        {
            int currVal = s.charAt(i);
            int newVal = currVal;

            if((currVal >= 65 && currVal <= 90))
            {
                newVal = currVal + (k%26);
                if(newVal > 90)
                    newVal-=26;
            }
            else if((currVal >= 97 && currVal <= 122))
            {
                newVal = currVal + (k%26);
                if(newVal > 122)
                    newVal-=26;
            }
            sBuilder.append((char)newVal);
        }
        return sBuilder.toString();
    }

    public static void main(String[] args)
    {
        String s = "middle-Outz";
        String result = caesarCipher(s,2);

        System.out.println(result);
    }
}
