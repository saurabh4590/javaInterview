package org.com;

/**
 * Program to print numbers in sequence using 2 threads 
 * We have used flag for its implementation
 */
public class FlagOddEven {

	private static Boolean flag = true;

	public static void main(String[] args) {

		Runnable odd = () -> {
			for (int i = 1; i < 10;) {
				if (FlagOddEven.flag) {
					System.out.println(i);
					i = i + 2;
					flag = false;
				}
			}
		};

		Runnable even = () -> {
			for (int i = 2; i < 10;) {
				if (!FlagOddEven.flag) {
					System.out.println(i);
					i = i + 2;
					flag = !flag;
				}
			}
		};

		Thread thread = new Thread(odd);
		Thread thread2 = new Thread(even);
		thread.start();
		thread2.start();
	}

}
