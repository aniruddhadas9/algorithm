package com.candifood.ArrayOperation;

/**
 * Created by adas008c on 9/20/2016.
 */
public class DeleteElementHavingZeroValueInArray {

    public int[] sanitaizedArray(int[] input) {
        int[] output = new int[newArrayLength(input)];
        int count=0;
        for(int i=0; i<input.length; i++) {
            if(input[i]!=0){
                output[count] = input[i];
                count++;
            }
        }
        return output;
    }

    private int newArrayLength(int[] input) {
        int count=0;
        for(int i=0; i<input.length; i++) {
            if(input[i]!=0)count++;
        }
        return count;
    }

}
