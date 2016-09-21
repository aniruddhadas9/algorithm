package com.candifood.test.search;

import com.candifood.search.LinerSearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Tested: Yes
 *
 * @author Aniruddha Das
 *
 * @description The linear-search algorithm searches a one-dimensional array
 *         for a specific data item. The search first examines the element at
 *         index 0 and continues examining successive elements until either the
 *         data item is found or no more elements remain to examine. The
 *         following pseudo code demonstrates this algorithm:
 *         <p/>
 *         Advantage of Linear Search
 *         <p/>
 *         1. simplicity of the program
 *         2. It will work in unsorted list or array [ Binary search always work in sorted array]
 */
public class LinerSearchTest {

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
        int result = new LinerSearch().search(numbers, 23);
        if (result==0){

        } else {

        }
    }
}
