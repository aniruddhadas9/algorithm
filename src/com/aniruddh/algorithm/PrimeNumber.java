package com.aniruddh.algorithm;


/**
 * 
 * Tested: Yes
 * 
 * A number is a prime if that number is only divisible by itself and one.
 *
 */
public class PrimeNumber {
	
	
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		System.out.println("the number 13 is prime number, right? "+isPrime(14));
	}

}
