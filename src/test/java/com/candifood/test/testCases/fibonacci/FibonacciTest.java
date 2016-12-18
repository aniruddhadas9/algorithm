package com.candifood.test.testCases.fibonacci;


import org.junit.Test;

import static com.candifood.fibonacci.Fibonacci.fibonacci;

/**
 * Tested: Yes
 *
 * @author Aniruddha Das
 */
public class FibonacciTest {

    private int size = 12;

    @Test
    public void test() {
        fibonacci(size).forEach(System.out::println);
    }
}