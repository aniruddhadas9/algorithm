package com.candifood.algorithm;

/**
 * Tested: yes
 * <p/>
 * Created by Aniruddha Das on 2/8/2016.
 */
public class Factorial {

    public long factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "n must be greater than zero");
        }
        long toReturn = 1;
        for (int i = 1; i <= n; i++) {
            toReturn *= i;
        }
        return toReturn;
    }

}
