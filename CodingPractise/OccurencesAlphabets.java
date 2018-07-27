package org.com.Algorithm.July;

import java.util.HashMap;

/**
 * Calculate the occurrences of an alphabet in the String
 */
public class OccurencesAlphabets {

	public static void calculateOccurences(String str) {

		// Character in Hashmap stores the character whose occurrence to be calculated
		// and Integer stores its count
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}
		}

		System.out.println(hashMap);
	}

	public static void main(String[] args) {
		calculateOccurences("i am sourabh In the plain");
	}

}
