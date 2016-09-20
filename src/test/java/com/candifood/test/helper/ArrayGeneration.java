package com.candifood.test.helper;

import java.util.Random;

/**
 * Created by adas008c on 9/19/2016.
 */
public class ArrayGeneration {

    private static int size;
    private static int max;
    private static int[] numbers;

    public static int[] randomArray(int size) {
        max = 99;//String.valueOf(size).length();
        numbers = new int[size];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(max);
        }
        return numbers;
    }
}
