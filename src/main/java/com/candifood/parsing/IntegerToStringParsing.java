package com.candifood.parsing;

import java.text.DecimalFormat;

/**
 * Created by adas008c on 9/15/2016.
 */
public class IntegerToStringParsing {

    public String convertToString(int a) {

        int c;
        char m;
        StringBuilder ans = new StringBuilder();
        DecimalFormat df = new DecimalFormat("00000");
        // convert the String to int
        while (a > 0) {
            c = a % 10;
            a = a / 10;
            m = (char) ('0' + c);
            ans.append(m);
            System.out.println("|c: " + c + "|a: " + a + "|");
        }
        return ans.reverse().toString();
    }

}
