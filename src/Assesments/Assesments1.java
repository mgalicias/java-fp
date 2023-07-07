package Assesments;

/*
 * In this assesment we are going to
 * develop a method cipher and decipher
 * 
 */

public class Assesments1 extends ImplementsRunnable {

//	@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementsRunnable thread1 = new ImplementsRunnable();
		Thread thread2 =  new Thread("Thread2");
		Assesments1 thread3 = new Assesments1();
		ImplementsRunnable thread4 = new Assesments1();
		Assesments1 thread5 = new Assesments1();

		thread1.setName("thread1-mother-fucker");

		thread2.setDaemon(true);

		// interface and thread

		System.out.println(thread1.getId() + " " + thread1.getState() + " " + thread1.isAlive() + " "
				+ thread1.isDaemon() + " " + thread1.getClass() + " " + thread1.getName());
		System.out.println(thread2.getId() + " " + thread1.getState() + " " + thread2.isAlive() + " "
				+ thread2.isDaemon() + " " + thread2.getClass() + " " + thread2.getName());
		System.out.println(thread3.getId() + " " + thread1.getState() + " " + thread3.isAlive() + " "
				+ thread3.isDaemon() + " " + thread3.getClass() + " " + thread3.getName());
		System.out.println(thread4.getId() + " " + thread1.getState() + " " + thread4.isAlive() + " "
				+ thread4.isDaemon() + " " + thread4.getClass() + " " + thread4.getName());
		System.out.println(thread5.getId() + " " + thread1.getState() + " " + thread5.isAlive() + " "
				+ thread5.isDaemon() + " " + thread5.getClass() + " " + thread5.getName());
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		thread1.setPriority(MAX_PRIORITY);
		thread2.setPriority(MIN_PRIORITY);
		thread3.setPriority(NORM_PRIORITY);

		System.out.println(thread1.getId() + " " + thread1.getState() + " " + thread1.isAlive() + " "
				+ thread1.isDaemon() + " " + thread1.getClass() + " " + thread1.getName());
		System.out.println(thread2.getId() + " " + thread1.getState() + " " + thread2.isAlive() + " "
				+ thread2.isDaemon() + " " + thread2.getClass() + " " + thread2.getName());
		System.out.println(thread3.getId() + " " + thread1.getState() + " " + thread3.isAlive() + " "
				+ thread3.isDaemon() + " " + thread3.getClass() + " " + thread3.getName());
		System.out.println(thread4.getId() + " " + thread1.getState() + " " + thread4.isAlive() + " "
				+ thread4.isDaemon() + " " + thread4.getClass() + " " + thread4.getName());
		System.out.println(thread5.getId() + " " + thread1.getState() + " " + thread5.isAlive() + " "
				+ thread5.isDaemon() + " " + thread5.getClass() + " " + thread5.getName());

//		System.out.println(thread1.getState());

	}

}
