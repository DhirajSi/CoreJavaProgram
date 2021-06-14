package corejava.multithreading;

import java.util.Iterator;

public class MultithreadUsingThread {

	public static void main(String[] args) {
	
		A a= new A();
		B b= new B();
		a.start();
		b.start();

	}

}

class A extends Thread {
	public  void run() {
		show();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void show() {
		for(int i=0;i<5;++i) {
		System.out.println("Hi");
		}
		
	}
}

class B extends Thread {
	public void run() {
		show();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void show() {
		for(int i=0;i<5;++i) {
			System.out.println("Hello");
			}
	}
}
