package com.candifood.coreJava;

/**
 *   Will finally block execute if there is System.exit(0) in try/catch block.
 *
 *   https://stackoverflow.com/questions/3473756/java-convert-primitive-class
 */
public class FinallyAndSystemDotExit {

    /**
     * Finally block will not execute as system.exit will get out of it.
     * @param args
     */
    public static void main(String args[]) {
        try {
            System.out.println("Inside try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }
    }
}
