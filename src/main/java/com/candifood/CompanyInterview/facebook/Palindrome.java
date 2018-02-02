package com.candifood.CompanyInterview.facebook;


/*
 * Madam I'm adaM << is not palindrome
 * MadamImadaM << is palindrome
 * d&fdghkkh55d!!
 */


import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {

        Palindrome solution = new Palindrome();

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java 8.");

        for (String string : strings) {

            if(solution.matchString(string, 0, string.length())==0){

                System.out.println(string+ "is not a palindrom");
            } else {
                System.out.println(string+ "is a palindrom");
            }
        }

    }

    // Character.isLetterOrDigit(c)
    public int matchString(String input, int left, int right) {

        if(input.length()<1) return 1;

        int leftPosition = this.positionOfValidChar(input, left, 0);
        int rightPosition = this.positionOfValidChar(input, right, 1);


        if(input.charAt(leftPosition) != input.charAt(rightPosition) ) {
            return matchString(input, leftPosition, rightPosition);
        }

    }

    private int positionOfValidChar(String input, int count, int ofset) {
        if(Character.isLetterOrDigit(input.charAt(count) )) {
            return count;
        } else {
            count = (ofset==1) ? count-1:count+1;
            return this.positionOfValidChar(input, count, ofset);
        }
    }
}


