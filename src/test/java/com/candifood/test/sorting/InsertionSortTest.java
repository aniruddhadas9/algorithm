package com.candifood.test.sorting;

/**
 * Created by eTouch on 2/5/2016.
 *
 * Tested: not tested yet
 *
 * Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * Every repetition of insertion sort removes an element from the input data, inserting it into the correct position in the already-sorted list,
 * until no input elements remain. The choice of which element to remove from the input is arbitrary, and can be made using almost any choice algorithm.
 *
 *
 */
public class InsertionSortTest {

    public int[] doInsertionSortBySwap(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }


    public void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }

    }

}
