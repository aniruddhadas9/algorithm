package com.candifood.test.testCases.starShapes;

import com.candifood.starShapes.Pyramid;
import org.junit.Test;

public class PyramidTest {

    @Test
    public void pyramidTest() {
        new Pyramid().make(10);
    }
}
