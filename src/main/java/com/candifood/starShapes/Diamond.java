package com.candifood.starShapes;

public class Diamond {

    public void make(int size) {
        int i, j, k;
        for(i=1;i<=size;i++) {
            for(j=i;j<size;j++) {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=size-1;i>=1;i--) {
            for(j=size;j>i;j--) {
                System.out.print(" ");
            }
            for(k=1;k<(i*2);k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
