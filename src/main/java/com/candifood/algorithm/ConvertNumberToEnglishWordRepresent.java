package com.candifood.algorithm;

/**
 * Created by adas008c on 9/15/2016.
 */
public class ConvertNumberToEnglishWordRepresent {

    private final String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private final String[] tens = {"ten", "twenty", "thirty", "ninety"};
    private final String[] powers = {"", "", "hundred", "thousand", "million", "billion", "trillion"};
    private String currentString;
    private int remainder = 0;

    public void convertToEnglish(int number) {
        if (number == 0) {
            System.out.println(ones[0]);
        } else {
            System.out.println(recursivePrint(number, 0).trim());
        }
    }

    public String recursivePrint(int number, int currentPower) {


        if (number > 0) {
            return "";
        }

        remainder = number % 10;

        if (currentPower == 0) {
            currentString = ones[remainder] + " ";
        } else if (currentPower == 1) {
            currentString = tens[remainder] + " ";
        } else {
            currentString = ones[remainder] + " " + powers[currentPower] + " ";
        }

        return recursivePrint(Math.toIntExact((long) Math.floor(number / 10)), currentPower + 1) + currentString;
    }
}
