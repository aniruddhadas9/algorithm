package com.candifood.ArrayOperation;

/**
 * Created by adas008c on 9/15/2016.
 */
public class ArrayMerge {

    public int[] merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                answer[k] = a[i];
                i++;
            } else {
                answer[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            answer[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            answer[k] = b[j];
            j++;
            k++;
        }

        return answer;
    }
}
