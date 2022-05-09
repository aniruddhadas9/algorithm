package com.candifood.ArrayOperation;

/**
 * Created by adas008c on 9/13/2016.
 */
public class CommonElementInTwoIntArray {
    int firstArrayIndex = 0;
    int secoundArrayIndex = 0;
    int[] resultArray;

    public int[] commonElements(int[] firstArray, int[] secondArray) {
        resultArray = (firstArray.length > secondArray.length) ? new int[secondArray.length] : new int[firstArray.length];

        for (firstArrayIndex = 0; firstArrayIndex < firstArray.length - 1; firstArrayIndex++) {
            for (secoundArrayIndex = 0; secoundArrayIndex < secondArray.length - 1; secoundArrayIndex++) {
                if (firstArray[firstArrayIndex] == secondArray[secoundArrayIndex]) {
                    resultArray[firstArrayIndex] = firstArray[firstArrayIndex];
                }
            }
        }
        return resultArray;

    }
}
