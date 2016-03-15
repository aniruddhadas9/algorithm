package com.aniruddh.search.binarySearch;

class BSearchDemo {
    public static void main(String[] args) {
        int[] x = {-5, 12, 15, 20, 30, 72, 456};
        int loIndex = 0;
        int hiIndex = x.length - 1;
        int midIndex, srch = 72;

        while (loIndex <= hiIndex) {
            midIndex = (loIndex + hiIndex) / 2;
            if (srch > x[midIndex])
                loIndex = midIndex + 1;
            else if (srch < x[midIndex])
                hiIndex = midIndex - 1;
            else
                break;
        }

        if (loIndex > hiIndex)
            System.out.println(srch + " not found");
        else
            System.out.println(srch + " found");
    }
}