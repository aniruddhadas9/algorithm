package com.aniruddh.innerclass;


/**
 * @author eTouch
 * @desc We cannot define a class as private as java does not allow it
 * A class only can be declared as public, abstract or final.
 */
public class SimpleInnerClass {

    private String outerValue;
    private String outclass;

    static class staticInnerClass {
        public staticInnerClass() {
            System.out.println("this is a static inner class and can be instnaciated once the parent class object created");
        }

    }

    class InnerClass {
        private String className;
    }

    private class privateInnerClass {

        public privateInnerClass() {
            System.out.println("Normally in java classes cannot be declared as private but here as a inner class it can be as its treated as just a member of the class");
            System.out.println("Private inner class cannot be accessed out side of the class.");
            System.out.println("But inside the put class it can be treated as a member of the class and can be used.");

        }

        protected void printOuterValue() {
            System.out.println("the outer class outerValue: " + outerValue);
        }
    }


}
