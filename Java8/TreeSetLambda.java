package org.com.lambda;

import java.util.TreeSet;

public class TreeSetLambda {

	public static void main(String[] args) {
		// Default sorting order in TreeSet
		TreeSet<Integer> integers = new TreeSet<>();

		// Custom sorting order in TreeSet using Lambda
		// TreeSet<Integer> example = new TreeSet<>( Comparator c);
		TreeSet<Integer> integers2 = new TreeSet<>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);

		integers.add(10);
		integers.add(20);
		integers.add(10);
		integers.add(9);
		integers.add(12);
		integers.add(1);

		integers2.add(10);
		integers2.add(20);
		integers2.add(10);
		integers2.add(9);
		integers2.add(12);
		integers2.add(1);

		System.out.println("Natural Sorting Order " + integers);
		System.out.println("Custom Sorting Order " + integers2);

	}
}
