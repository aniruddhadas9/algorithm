package com.candifood.test.testCases.sorting;

import com.candifood.sorting.InsertionSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by eTouch on 2/5/2016.
 *
 * Tested: not tested yet
 *
 * Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * Every repetition of insertion sort removes an element from the input data, inserting it into the correct position in the already-sorted list,
 * until no input elements remain. The choice of which element to remove from the input is arbitrary, and can be made using almost any choice algorithm.
 *
 *
 */
public class InsertionSortTest {

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
    public void testInsertionSort() {
        long startTime = System.currentTimeMillis();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.doInsertionSortBySwap(numbers);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("InsertionSortTest|" + elapsedTime);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                fail("Should not happen");
            }
        }
        assertTrue(true);

    }

}
