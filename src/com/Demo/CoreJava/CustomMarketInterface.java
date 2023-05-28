package com.Demo.CoreJava;

import java.util.concurrent.Callable;

public interface CustomMarketInterface extends Runnable,Callable{

	//public  void operation();
	double d=1.2d;
	void dosomthing(int a,double d);
	int m(String s);
}
