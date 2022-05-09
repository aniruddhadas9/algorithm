package com.candifood.string;

/**
 * Created by adas008c on 12/14/2016.
 */
public class StringCompair {

    public boolean compairStringByEqualsOperator() {
        String s1 = "hello";
        String s2 = "hello";

        return (s1 == s2);
    }

    public boolean compairStringByEqualsMethod() {
        String s1 = "hello";
        String s2 = "hello";

        return s1.equals(s2);
    }

    public boolean compairStringLiteralWithStringObjectByEqualsOperator() {
        String s1 = new String("hello");
        String s2 = "hello";
        return s1 == s2;
    }

    public boolean compairStringLiteralWithStringObjectByEqualsMethod() {
        String s1 = new String("hello");
        String s2 = "hello";

        return s1.equals(s2);
    }


}
