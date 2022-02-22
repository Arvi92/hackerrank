package com.aravind.onemonthchallenge.strings;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example

s = '12:01:00PM'
Return '12:01:00'.

s = '12:01:00AM'
Return '00:01:00'.
 */

import java.io.*;

class TimeConversionResult {

    public static String timeConversion(String s) {

        int hour = Integer.parseInt(s.substring(0,2));
        String militaryTimeHour = s.substring(0,2);

        if("PM".equals(s.substring(8,10))){
            if(hour < 12)
                militaryTimeHour = hour + 12 + "";
            else
                militaryTimeHour = "12";
        }
        else
        {
            if(hour == 12)
                militaryTimeHour = "00";
        }
        militaryTimeHour = militaryTimeHour + s.substring(2,8);
        return militaryTimeHour;
    }
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        String s = "11:59:59PM";
        String result = TimeConversionResult.timeConversion(s);
    }
}