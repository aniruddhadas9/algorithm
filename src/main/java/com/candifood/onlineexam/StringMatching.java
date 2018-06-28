package com.candifood.onlineexam;

public class StringMatching {

    static int total = 10;
    Integer in = 23;


    public void call() {
        int total = 5;
        System.out.println(this.total);
    }

    public static void main(String args[]) {

        String a = null;

        StringMatching a1 = new StringMatching();
        a1.call();

        try {
            a.length();
        } catch (Exception e) {
            System.out.print(a);
        }


    }
}
