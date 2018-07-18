package org.com.Algorithm.July;

/**
 * Singleton Pattern implementation using ENUM
 */
enum EnumSingletonClass {
	SINGLETON;
}

public class EnumSingleton {
	public static void main(String[] args) {
		EnumSingletonClass enumSingleton = EnumSingletonClass.SINGLETON;
		EnumSingletonClass enumSingleton2 = EnumSingletonClass.SINGLETON;
		System.out.println(enumSingleton.hashCode());
		System.out.println(enumSingleton2.hashCode());
	}
}
