package com.candifood.test.fibonacci;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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