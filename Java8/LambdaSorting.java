package org.com.lambda;

import java.util.ArrayList;
import java.util.*;

/**
 * Custom sorting using Comparator and Lambda expressions
 */
public class LambdaSorting {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(12);
		arrayList.add(1);
		arrayList.add(9);
		arrayList.add(4);
		arrayList.add(123);

		// It implements compare method using Lambda expressions
		Collections.sort(arrayList, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		System.out.println(arrayList);
	}
}
