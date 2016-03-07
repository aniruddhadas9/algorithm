package com.aniruddh.garbageCollection;

public class NormalGarbageCollection {
	
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total memory:"+runtime.totalMemory()+"|Free memory: "+runtime.freeMemory()+"|Max memory"+runtime.maxMemory());
		runtime.gc();
		System.out.println("Total memory:"+runtime.totalMemory()+"|Free memory: "+runtime.freeMemory()+"|Max memory"+runtime.maxMemory());
	}

}
