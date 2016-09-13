package com.candifood.algorithm;

import java.text.DecimalFormat;

/**
 * Tested: Yes
 */
public class IntegerToString {

    public static void main(String[] args) {
        int input = 974432374;
        System.out.println(input);
        String output = new IntegerToString().convertToString(input);
        System.out.println(output);
    }

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
