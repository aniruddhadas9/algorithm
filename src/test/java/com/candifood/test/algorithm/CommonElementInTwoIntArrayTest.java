package com.candifood.test.algorithm;

import com.candifood.ArrayOperation.CommonElementInTwoIntArray;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by adas008c on 9/13/2016.
 */
public class CommonElementInTwoIntArrayTest {
    int firstArrayIndex = 0;
    int secoundArrayIndex = 0;

    int[] firstArray;
    int[] secoundArray;

    @Before
    public void before() {
        firstArray = new int[12];
        secoundArray = new int[12];
        Random generator = new Random();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = generator.nextInt(12);
        }
        for (int i = 0; i < secoundArray.length; i++) {
            secoundArray[i] = generator.nextInt(12);
        }

    }

    @Test
    public void testCommonElementInTwoIntArray() {
        long startTime = System.currentTimeMillis();

        CommonElementInTwoIntArray commonElementInTwoIntArray = new CommonElementInTwoIntArray();
        int[] commonElementArray  = commonElementInTwoIntArray.commonElements(firstArray, secoundArray);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("CommonElementInTwoIntArrayTest " + elapsedTime);

        System.out.println("Fistst Array ");
        for (int i = 0; i < firstArray.length - 1; i++) {
            System.out.print(firstArray[i]+", ");
        }

        System.out.println("\nSecound Array ");
        for (int i = 0; i < secoundArray.length - 1; i++) {
            System.out.print(secoundArray[i]+", ");
        }

        System.out.println("\nResult Array ");
        for (int i = 0; i < commonElementArray.length - 1; i++) {
            System.out.print(commonElementArray[i]+", ");
        }

    }
}
