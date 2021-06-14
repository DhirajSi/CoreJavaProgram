package corejava.multithreading;

public class multithreadingUsingRunable {
	public static void main(String[] args) {
		Aa a= new Aa();
		Bb b= new Bb();
		Thread thread = new Thread(a);
		Thread thread2= new Thread(b);
		thread.start();
		thread2.start();
		
	}

}


class Aa implements Runnable {
	public void run() {
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

class Bb implements Runnable{
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
