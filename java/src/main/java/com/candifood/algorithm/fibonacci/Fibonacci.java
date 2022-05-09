package com.candifood.algorithm.fibonacci;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tested: Yes
 *
 * @author Aniruddha Das
 */
public class Fibonacci {


    public static List<Integer> fibonacci(int input) {

        final List<Integer> result = new ArrayList<>(input);

        if (input < 0) {
            throw new IllegalArgumentException("input must not be less than zero");
        }
        // fibonacci of 0 is empty array. it can also be adjusted to one tiem as 0 in the list
        if (input == 0) {
            return new ArrayList<>();
        }

        // fibonacci of 1 is one item and that is 0. It can also be considered as two items like [0, 1] in the list
        if (input == 1) {
            return Arrays.asList(0);
        }

        // fibonacci of 2 is [0,1] and its not wise to calculate using loop
        if (input == 2) {
            return Arrays.asList(0, 1);
        }

        // for all other cases

        // add the first item 0 as it cannot be added with patten and remove one item from list
        result.add(0);
        input = input - 1;

        // add the first item 1 as it cannot be added with patten and remove one item from list
        result.add(1);
        input = input - 1;

        // looping rest of the item and adding to the list
        while (input > 0) {
            int a = result.get(result.size() - 1);
            int b = result.get(result.size() - 2);
            result.add(a + b);
            input = input - 1;
        }

        // return the result
        return result;
    }

    public static void main(String[] args) {
        for (int i : fibonacci(40)) {
            System.out.println(i);
        }
    }
}