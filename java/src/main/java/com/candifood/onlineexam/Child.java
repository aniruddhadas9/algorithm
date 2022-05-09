package com.candifood.onlineexam;

class Parent {
    protected static int count = 0;
    protected Number getLocalCode( String value, boolean isValid){
        return 10;
    }
    public Parent () {
        count ++;
    }


    static int getCount() {
        return count;
    }
}

public class Child  extends Parent {

    public Child() {

        //  this will l be a complile error.
        Parent.count ++;
    }

}
