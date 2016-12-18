package com.candifood.starShapes;

/**
 * Created by adas008c on 9/15/2016.
 */

public class DiamondWithoutFilling {

    public void make(int size) {
        int i, j;

        for (i = 1; i <= size; i++) {
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) System.out.print("\n");
            else System.out.print("*\n");
        }

        for (i = size - 1; i >= 1; i--) {
            for (j = size; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) System.out.print("\n");
            else System.out.print("*\n");
        }

    }

    public void usingNamespace(int size) {
        int i, j, k, n = 0, count;

        System.out.println("Enter a odd No for Diamond Star Pattern " + n);


        for (i = 1; i <= n; i++) {
            if (i <= (n + 1) / 2) {
                for (j = i; j < (n + 1) / 2; j++) {
                    System.out.print(" ");
                }
            } else {
                for (j = 1; j <= (i - (n + 1) / 2); j++) {
                    System.out.print(" ");
                }
            }

            if (i <= (n + 1) / 2) {
                for (k = 1; k < 2 * i; k++) {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } else {
                for (k = 0; k < (2 * n - 2 * i) + 1; k++) {
                    if (k == 0 || k == (2 * n - 2 * i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
        }
    }


}
