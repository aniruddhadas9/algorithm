package com.candifood.starShapes;

/**
 * Created by adas008c on 9/13/2016.
 */
public class RightSideTriangle {

    public void make(int size) {
        int i, j, k;
        for (i = 5; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
