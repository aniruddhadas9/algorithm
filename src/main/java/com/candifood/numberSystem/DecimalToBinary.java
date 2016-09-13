package com.candifood.numberSystem;

/**
 * @author Aniruddha Das
 *
 * @apiNote This programm will take input as an decimal number and convert it to binary number
 * The process is to device the decimal number by to and keep the
 *
 */

public class DecimalToBinary {

    public static void main(String [] args) {
        int[] binaryNumber = new DecimalToBinary().decimalToBinary(14344);
        System.out.println("lengthof the output array="+binaryNumber.length);
        for (int i=0;i<binaryNumber.length;i++) {
            System.out.println(binaryNumber[i]);
        }

    }

    private int[] decimalToBinary(int input) {
        int[] returnValue = new int[64];
        for (int i=0;i<=input;i++) {
            if(input!=0) {
                returnValue[returnValue.length-i] = input%2;
                input = input/2;
            }

        }
        return returnValue;
    }

}
