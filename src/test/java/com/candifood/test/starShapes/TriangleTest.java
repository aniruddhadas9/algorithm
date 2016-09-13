package com.candifood.test.starShapes;

import com.candifood.starShapes.Triangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @Test
    public void testTriangle() {
        new Triangle().triangle(99);
    }
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

}
