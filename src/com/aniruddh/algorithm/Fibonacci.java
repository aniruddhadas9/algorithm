package com.aniruddh.algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tested: Yes
 *
 * @author Aniruddha Das
 */
public class Fibonacci {
    public static List<Integer> fibonacci(int n) {
        final List<Integer> seq = new ArrayList<>(n);
        if (n < 0) {
            throw new IllegalArgumentException("n must not be less than zero");
        }
        if (n == 0) {
            return new ArrayList<>();
        }
        if (n == 1) {
            return Arrays.asList(0);
        }
        if (n == 2) {
            return Arrays.asList(0, 1);
        }

        seq.add(0);
        n = n - 1;
        seq.add(1);
        n = n - 1;
        while (n > 0) {
            int a = seq.get(seq.size() - 1);
            int b = seq.get(seq.size() - 2);
            seq.add(a + b);
            n = n - 1;
        }
        return seq;
    }

    public static void main(String[] args) {
        for (int i : fibonacci(12)) {
            System.out.println(i);
        }
    }
}