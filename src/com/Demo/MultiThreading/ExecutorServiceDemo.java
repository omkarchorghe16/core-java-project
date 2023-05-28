package com.Demo.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Fixed thread pool
		System.out.println("1.Fixed thread pool----------------------------------");
		int coreCount=Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		ExecutorService service=Executors.newFixedThreadPool(coreCount);
		//submit tasks
				for(int i=0;i<100;i++) {
					service.execute(new RunnableDemo());
				}
				
		service.shutdown();
		service.shutdownNow();
		System.out.println(service.isShutdown());
		System.out.println(service.isTerminated());
		
		
		//2.Cahched thread pool
		System.out.println("2.Cahched thread pool--------------------------------");
		ExecutorService cachedService=Executors.newCachedThreadPool();
		//submit tasks
				for(int i=0;i<100;i++) {
					cachedService.execute(new RunnableDemo());
				}
				
				
		//3.Sheduled thread pool
		System.out.println("3.Sheduled thread pool-----------------------------");
		ScheduledExecutorService sheduledService=Executors.newScheduledThreadPool(10);
		//tasks to run after 10 sec delay
		sheduledService.schedule(new RunnableDemo(), 10, TimeUnit.SECONDS);
		//tasks to run repetadly every 10 sec 
		sheduledService.scheduleAtFixedRate(new RunnableDemo(),15, 10, TimeUnit.SECONDS);
		//tasks to run repeatedly 10 sec after previous tasks complete
		sheduledService.scheduleWithFixedDelay(new RunnableDemo(), 15,10, TimeUnit.SECONDS);
		
		
		//4.single threaded executor
		System.out.println("4.single threaded executor-----------------------");
		ExecutorService singleService=Executors.newSingleThreadExecutor();
		//submit tasks
		for(int i=0;i<100;i++) {
			singleService.execute(new RunnableDemo());
		}
		
		System.out.println("Thread name: "+Thread.currentThread().getName());

	}

}
