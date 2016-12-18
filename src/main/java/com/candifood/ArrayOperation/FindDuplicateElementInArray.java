package com.candifood.ArrayOperation;

/**
 * Created by adas008c on 9/19/2016.
 */
public class FindDuplicateElementInArray {

    private int[] unique;
    private int[] onlyDuplicate;

    public int[] duplicateElements(int[] input, int delete) {

        unique = new int[input.length];
        onlyDuplicate = new int[input.length];
        int duplicateFlag = 0;

        for (int i = 0; i < input.length; i++) {
            duplicateFlag = 0;
            for (int j = 0; j < unique.length; j++) {
                if (input[i] == unique[j]) {
                    duplicateFlag = 1;
                }
            }
            if (duplicateFlag == 0) {
                unique[i] = input[i];
            } else {
                onlyDuplicate[i] = input[i];
            }
        }

        int[] sanitizedOnlyDuplicate = delete == 0 ? new DeleteElementHavingZeroValueInArray().sanitaizedArray(onlyDuplicate)
                : new DeleteElementHavingZeroValueInArray().sanitaizedArray(unique);

        for (int j = 0; j < sanitizedOnlyDuplicate.length; j++) {
            System.out.print(sanitizedOnlyDuplicate[j] + ", ");

        }

        System.out.println("\n------------------------------------------");

        return sanitizedOnlyDuplicate;
    }
}
