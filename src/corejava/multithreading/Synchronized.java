package corejava.multithreading;

import java.util.Iterator;

class Test {
	int i = 1;

	public synchronized int getIncrement() {
		i++;

		return i;
	}

}

public class Synchronized {
	public static void main(String[] args) throws InterruptedException {

		Test test = new Test();
		Thread thread1 = new Thread(new Runnable() {
			int result = 0;

			public void run() {
				for (int i = 1; i < 1000; i++) {
					result = test.getIncrement();
				}
				// System.out.println(result);
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			int result = 0;

			public void run() {
				for (int i = 1; i <= 1000; i++) {
					result = test.getIncrement();
				}
				System.out.println(result);
			}
		});
		thread1.start();
		thread1.join();
		thread2.start();

		//thread2.join();

	}

}
