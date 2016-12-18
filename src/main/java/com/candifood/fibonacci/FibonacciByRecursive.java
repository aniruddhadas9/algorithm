package com.candifood.fibonacci;

import java.util.Arrays;

public class FibonacciByRecursive {


    public int fibonacciCalculation(int input) {

        if(input < 0) throw new IllegalArgumentException("Fibonacci does not work on negative numbers");

        if(input < 2) return input;

        if(input == 1) return 1;

        else  return fibonacciCalculation(input - 1) + fibonacciCalculation(input -2);
    }

    public int[] fibonacci(int number) {

        // result variable to hold the result
        int[] result = new int[number+1];

        // looping until the input number and getting the fibonacci of each value
        while(number >= 0) {
            result[number] = fibonacciCalculation(number);
            number --;
        }

        // return the result
        return result;
    }

    public static void main(String args[]) {
        FibonacciByRecursive fibonacciByRecursive = new FibonacciByRecursive();

        Arrays.stream(fibonacciByRecursive.fibonacci(3)).forEach( value -> System.out.println(value));
    }
}
