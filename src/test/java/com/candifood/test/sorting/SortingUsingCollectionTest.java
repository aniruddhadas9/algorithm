package com.candifood.test.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Aniruddha Das
 *         Collections.sort will sort the array in default object sorting order
 */
public class SortingUsingCollectionTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.sort(list);
        System.out.println(list);
    }
}


final class SortingUsingCollection1 {


}
