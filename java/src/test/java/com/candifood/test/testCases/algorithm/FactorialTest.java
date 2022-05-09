package com.candifood.test.testCases.algorithm;

import com.candifood.algorithm.Factorial;
import org.junit.Test;

/**
 * Tested: yes
 * <p/>
 * Created by Aniruddha Das on 2/8/2016.
 */
public class FactorialTest {

    @Test
    public void main() {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(3));
        System.out.println(factorial.factorial(7));
        System.out.println(factorial.factorial(10));
        System.out.println(factorial.factorial(15));
        System.out.println(factorial.factorial(19));
    }

}
