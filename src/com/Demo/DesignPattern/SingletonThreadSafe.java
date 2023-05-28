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
		// TODO Auto-generated method stub

		SingletonThreadSafe s=SingletonThreadSafe.getInstance();
		System.out.println(s.hashCode());
		SingletonThreadSafe s1=SingletonThreadSafe.getInstance();
		System.out.println(s1.hashCode());
		
		SingletonThreadSafe s3=new SingletonThreadSafe();
		System.out.println(s3.hashCode());
		
	}

}
