package com.aniruddh.algorithm;

import java.util.ArrayList;
import java.util.List;


/**
 * Tested: Yes
 *
 * @author Aniruddha Das
 */
public class Fizzbuzz {

    public static List<String> fizzBuzz(final int n) {
        final List<String> toReturn = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                toReturn.add("FizzBuzz");
            } else if (i % 3 == 0) {
                toReturn.add("Fizz");
            } else if (i % 5 == 0) {
                toReturn.add("Buzz");
            } else {
                toReturn.add(Integer.toString(i));
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(34));
    }
}