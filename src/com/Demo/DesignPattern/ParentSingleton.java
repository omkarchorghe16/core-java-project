package com.Demo.DesignPattern;

public class ParentSingleton {

	private static ParentSingleton instance;

	// Make a constructor private. //parent should protected if child private
	protected ParentSingleton() {

	}

	public static synchronized ParentSingleton getInstance() {
		if (instance == null) {
			instance = new ParentSingleton();
		}

		return instance;
	}

}
