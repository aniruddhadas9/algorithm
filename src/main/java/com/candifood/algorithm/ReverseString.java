package com.candifood.algorithm;

/**
 * Tested: Yes
 * <p/>
 * Created by Aniruddha Das on 2/8/2016.
 */
public class ReverseString {

    public static String inPlaceReverse(final String s) {
        final StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < builder.length() / 2; i++) {
            final char tmp = builder.charAt(i);
            final int otherEnd = builder.length() - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd, tmp);
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(inPlaceReverse("aniruddha"));
    }
}
