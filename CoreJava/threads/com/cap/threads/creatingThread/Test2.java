package com.cap.threads.creatingThread;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("main started");
		Thread2 th1=new Thread2();
		Thread t1=new Thread(th1);
		t1.start();
		System.out.println("main ended");
	}
}
