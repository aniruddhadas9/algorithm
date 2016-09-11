package com.aniruddh.search;

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
public class LinerSearch {

    public static void main(String[] args) {
        int i, srch = 112;
        int[] x = {20, 15, 12, 30, -5, 72, 456};
        for (i = 0; i <= x.length - 1; i++)
            if (x[i] == srch) {
                System.out.println("Found " + srch);
                return;
            }
        System.out.println("Did not find " + srch);
    }
}
