package com.candifood.test.ArrayOperation;

import com.candifood.ArrayOperation.ArrayMerge;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by adas008c on 9/15/2016.
 */
public class ArrayMergeTest {

    private int firstArray[] = {1, 23, 333, 34, 2, 455};
    private int secoundArray[] = {23, 27, 33, 45, 3, 2, 1};

    @Before
    public void setValue() {

    }

    @Test
    public void test() {
        int answer[] = new ArrayMerge().merge(firstArray, secoundArray);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
