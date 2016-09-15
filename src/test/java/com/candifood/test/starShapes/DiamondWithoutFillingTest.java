package com.candifood.test.starShapes;

import com.candifood.starShapes.Diamond;
import com.candifood.starShapes.DiamondWithoutFilling;
import org.junit.Test;

/**
 * Created by Aniruddha Das on 9/15/2016.
 */
public class DiamondWithoutFillingTest {

    @Test
    public void diamondWithoutFillingTest() {
        new DiamondWithoutFilling().make(10);
    }

    @Test
    public void diamondWithoutFillingUsingNamespaceTest() {
        new DiamondWithoutFilling().usingNamespace(10);
    }
}
