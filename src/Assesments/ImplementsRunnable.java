package Assesments;

public class ImplementsRunnable extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread => " + i);
			System.out.println(Thread.currentThread().getName());
			System.out.println("Child thread");
			Thread.yield();
		}

	}

}
