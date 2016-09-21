package com.candifood.test.ArrayOperation;

import com.candifood.ArrayOperation.DeleteDuplicateElementFromArray;
import com.candifood.ArrayOperation.DeleteElementHavingZeroValueInArray;
import com.candifood.test.helper.ArrayGeneration;
import org.junit.Test;

/**
 * Created by Aniruddha Das on 9/20/2016.
 */
public class DeleteElementHavingZeroValueInArrayTest {

    private int[] duplicate;

    @Test
    public void duplicateElements() {
        int[] input = ArrayGeneration.randomArray(20);
        duplicate = new DeleteElementHavingZeroValueInArray().sanitaizedArray(input);

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
