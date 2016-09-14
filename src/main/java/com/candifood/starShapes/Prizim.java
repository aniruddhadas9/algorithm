package com.candifood.starShapes;

public class Prizim {


    public void make(int size) {
        int i, j;

        for(i=1; i<=size; i++) {
            for(j=size; j>i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(j=1; j<(i-1)*2; j++) {
                System.out.print(" ");
            }
            if(i==1) System.out.print("\n");
            else System.out.print("*\n");
        }

        for(i=size; i>=1; i--) {
            for(j=size; j>i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(j=1; j<(i-1)*2; j++) {
                System.out.print(" ");
            }
            if(i==1) System.out.print("\n");
            else System.out.print("*\n");
        }

    }
}
