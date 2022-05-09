package com.candifood.onlineexam;

public class StaticExample {

    private static int count;


    static {
        System.out.println("in 1");
        count = 10;

        int x = 5;
        // x = ~x;
    }

    private int[] data;
    {
        System.out.println("2");
    }

    public static void main(String args) {
        System.out.println(count);

    }
}
