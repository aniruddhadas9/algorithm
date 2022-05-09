package com.candifood.test.testCases.algorithm;

import com.candifood.algorithm.Anagrams;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adas008c on 9/13/2016.
 */
public class AnagramTest {

    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void test() {

        List<String> words = new ArrayList<String>();
        words.add("tea");
        words.add("eat");
        words.add("cinema");
        words.add("iceman");
        words.add("tea");

        Anagrams anagram = new Anagrams(words);
        System.out.println(anagram.getAnagrams("tea").toString());
    }
}
