package com.candifood.test.search;

import com.candifood.search.BinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Tested Yes [It have some issue and need to be resolved]
 *
 * @author Aniruddha Das
 *
 * @description:
 *          The binary search divide the list into two part and start searching
 *         the particular value in corresponding part of the list In this way
 *         half of the list is always sliced out and need not to be looped. Due
 *         to its devide and search way it is the fasted searching algorithm
 *         till now in the world :)
 */
public class BinarySearchTest {


    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;

    @Before
    public void setUp() throws Exception {

        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }


    @Test
    public void searchTest() {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(32);
        numbers.add(1);
        numbers.add(6);
        numbers.add(13);
        numbers.add(114);
        numbers.add(311);
        numbers.add(61);
        numbers.add(89);
        numbers.add(34);
        numbers.add(78);
        //numbers.add(178);

        boolean result = new BinarySearch().search(numbers, 13);
        System.out.println("result: " + result);
        if (result) {
            System.out.println("The number available ");
        } else {
            System.out.println("Number does not exist in the list");
        }

    }
}
