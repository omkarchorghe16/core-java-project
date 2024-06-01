package com.Demo.DesignPattern;

public class SingletonThreadSafe {

	private static volatile SingletonThreadSafe instance;
	
    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe .class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
    
	public static void main(String[] args) {

		SingletonThreadSafe s=SingletonThreadSafe.getInstance();
		System.out.println(s.hashCode());
		SingletonThreadSafe s1=SingletonThreadSafe.getInstance();
		System.out.println(s1.hashCode());
		
		
		
	}

}
