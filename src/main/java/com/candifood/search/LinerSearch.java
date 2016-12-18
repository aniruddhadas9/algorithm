package com.candifood.search;

/**
 * Tested: Yes
 *
 * @author Aniruddha Das
 * @description The linear-search algorithm searches a one-dimensional array
 * for a specific data item. The search first examines the element at
 * index 0 and continues examining successive elements until either the
 * data item is found or no more elements remain to examine. The
 * following pseudo code demonstrates this algorithm:
 * <p/>
 * Advantage of Linear Search
 * <p/>
 * 1. simplicity of the program
 * 2. It will work in unsorted list or array [ Binary search always work in sorted array]
 */
public class LinerSearch {

    public int search(int[] input, int key) {
        int returnValue = 0;
        for (int i = 0; i <= input.length - 1; i++) {
            if (input[i] == key) {
                returnValue = 1;
            }
        }
        return returnValue;
    }
}
