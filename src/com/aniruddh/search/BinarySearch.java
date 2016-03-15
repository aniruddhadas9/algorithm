package com.aniruddh.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Tested Yes [It have some issue and need to be resolved]
 *
 * @author The binary search divide the list into two part and start searching
 *         the particular value in corresponding part of the list In this way
 *         half of the list is always sliced out and need not to be looped. Due
 *         to its devide and search way it is the fasted searching algorithm
 *         till now in the world :)
 */
public class BinarySearch {

    private static int sortCount = 0;

    public static boolean search(List<Integer> numbers, int key) {

        boolean returnValue = false;
        if (sortCount == 0) {
            System.out.println("unsorted list: " + numbers.toString());
            Collections.sort(numbers);
            sortCount++;
            System.out.println("sortCount: " + sortCount);
            System.out.println("sorted list: " + numbers.toString());
        }

        int medianIndex = numbers.size() / 2;
        int median = numbers.get(numbers.size() / 2);

        System.out.println("key: " + key + "|median: " + median + "|medianIndex: " + medianIndex + "|listSize: " + numbers.size());
        System.out.println("Numbers: " + numbers.toString());
        System.out.println("last part list:" + numbers.subList(medianIndex, numbers.size()).toString());
        System.out.println("first part list:" + numbers.subList(0, medianIndex).toString());
        System.out.println("--------------------------------------------");

        if (medianIndex == 0) {
            System.out.println("Searching is done!! median: " + median + "|key: " + key);
            returnValue = false;
            return false;
        }

        if (median == key) {
            System.out.println("Searching is done!! median: " + median + "|key: " + key);
            returnValue = true;
            return true;
        } else if (median < key) {
            search(numbers.subList(medianIndex, numbers.size()), key);
        } else if (median > key) {
            search(numbers.subList(0, medianIndex), key);
        }
        return returnValue;

    }

    public static void main(String args[]) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(32);
        numbers.add(1);
        numbers.add(6);
        numbers.add(13);
        numbers.add(114);
        numbers.add(311);
        numbers.add(61);
        numbers.add(89);
        numbers.add(34);
        numbers.add(78);
        //numbers.add(178);

        boolean result = search(numbers, 13);
        System.out.println("result: " + result);
        if (result) {
            System.out.println("The number available ");
        } else {
            System.out.println("Number does not exist in the list");
        }

    }
}
