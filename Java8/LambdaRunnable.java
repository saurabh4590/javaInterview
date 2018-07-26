package org.com.lambda;

/**
 * Program to implement Runnable using Lambda expressions
 */
public class LambdaRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("This is count :" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
