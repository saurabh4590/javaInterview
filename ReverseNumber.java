package org.com;

/**
 * Program to reverse an Integer
 */
public class ReverseNumber {

	public void reverse(int num) {
		if (num < 10) {
			System.out.print(num);
			return;
		} else {
			System.out.print(num % 10);
			reverse(num / 10);
		}
	}

	public static void main(String[] args) {
		ReverseNumber number = new ReverseNumber();
		number.reverse(2343999);
	}
}
