package com.candifood.ArrayOperation;

/**
 * Created by adas008c on 9/13/2016.
 */
public class CommonElementInTwoIntArray {
    int firstArrayIndex = 0;
    int secoundArrayIndex = 0;
    int[] resultArray;

    public int[] commonElements(int[] firstArray, int[] secoundArray) {
        resultArray = (firstArray.length > secoundArray.length) ? new int[secoundArray.length] : new int[firstArray.length];

        for (firstArrayIndex = 0; firstArrayIndex < firstArray.length - 1; firstArrayIndex++) {
            for (secoundArrayIndex = 0; secoundArrayIndex < secoundArray.length - 1; secoundArrayIndex++) {
                if (firstArray[firstArrayIndex] == secoundArray[secoundArrayIndex]) {
                    resultArray[firstArrayIndex] = firstArray[firstArrayIndex];
                }
            }
        }
        return resultArray;

    }
}
