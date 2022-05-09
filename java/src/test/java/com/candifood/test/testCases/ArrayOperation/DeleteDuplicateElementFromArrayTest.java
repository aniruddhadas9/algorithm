package com.candifood.test.testCases.ArrayOperation;

import com.candifood.ArrayOperation.FindDuplicateElementInArray;
import com.candifood.test.testCases.helper.ArrayGeneration;
import org.junit.Test;

/**
 * Created by adas008c on 9/19/2016.
 */
public class DeleteDuplicateElementFromArrayTest {

    private int[] duplicate;

    @Test
    public void duplicateElements() {
        int[] input = ArrayGeneration.randomArray(20);
        duplicate = new FindDuplicateElementInArray().duplicateElements(input, 1);

        System.out.print("input array: ");
        for (int i =0; i< input.length; i++) {
            System.out.print(input[i]+", ");
        }

        System.out.print("\noutput array: ");
        for (int i =0; i< duplicate.length; i++) {
            System.out.print(duplicate[i]+", ");
        }

    }

}
