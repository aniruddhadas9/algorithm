package com.candifood.ArrayOperation;

/**
 * Created by adas008c on 9/19/2016.
 */
public class FindDuplicateElementInArray {
    private int[] duplicate;
    public int[] duplicateElements(int[] input) {
        duplicate = new int[input.length];
        int duplicateFlag = 0;
        for(int i=0; i < input.length; i++) {
            duplicateFlag = 0;
            for(int j=0; j< duplicate.length; j++) {
                if(input[i] == duplicate[j]) {
                    duplicateFlag = 1;
                }
            }
            if(duplicateFlag==0) duplicate[i] = input[i];
        }
        return duplicate;
    }
}
