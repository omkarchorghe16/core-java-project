package com.Demo.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableDemo implements Callable{

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//Runtime.getRuntime().availableProcessors()
		
		ExecutorService services = Executors.newSingleThreadExecutor();
		
	      Future<?> future = services.submit(new CallableDemo());
	      
	      System.out.println("In Future isDone = " + future.isDone());
	      System.out.println("In Future isCancelled = " + future.isCancelled());
	      System.out.println("In Future get = " + future.get());
	      future.cancel(false);
	      
	      int processors = Runtime.getRuntime().availableProcessors();
	      ExecutorService executor =  Executors.newFixedThreadPool(processors);
	      
	        List<Future<Integer>> resultList = new ArrayList<>();
	 
	        for (int i = 1; i <= 10; i++) {
	            FactorialCalculator calculator = new FactorialCalculator(i);
	            Future<Integer> result = executor.submit(calculator);
	            resultList.add(result);
	        }
	         
	        executor.awaitTermination(5, TimeUnit.SECONDS);
	 
	        for (int i = 0; i < resultList.size(); i++) 
	        {
	            Future<Integer> result = resultList.get(i);
	            Integer number = null;
	            try {
	                number = result.get();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            } catch (ExecutionException e) {
	                e.printStackTrace();
	            }
	            System.out.printf("Main: Task %d: %d\n", i, number);
	        }
	 
	        executor.shutdown();
	    }
	
	      
	

	@Override
	public Object call() throws Exception {
		 System.out.println("In call");
	      String name = "test";
	      return name;
	}

}
