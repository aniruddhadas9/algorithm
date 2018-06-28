package com.candifood.onlineexam;

import java.util.function.Supplier;

public class StreamProgram {
    public static void main(String args[]) {
        Supplier<String> i = () -> "car";
       //  Supplier<String> c = (x) -> System.out.print(i);
        Supplier<String> d = () -> "car";

    }
}



abstract class kk {
    abstract public void myMethod();
}
