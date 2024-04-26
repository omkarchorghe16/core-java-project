package com.Demo.MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Producer consumer problem Solution
public class BlockingQueuePCSolution { 
	 
	   public static void main(String[] args) { 
	 
	       BlockingQueue<String> queue=new ArrayBlockingQueue<>(5); 
	       Producer producer=new Producer(queue); 
	       Consumer consumer=new Consumer(queue); 
	       Thread producerThread = new Thread(producer); 
	       Thread consumerThread = new Thread(consumer); 
	 
	       producerThread.start(); 
	       consumerThread.start(); 
	 
	   } 
	 
	   static class Producer implements Runnable { 
	 
	       BlockingQueue<String> queue=null; 
	 
	       public Producer(BlockingQueue queue) { 
	           super(); 
	           this.queue = queue; 
	       } 
	 
	       @Override 
	       public void run() { 
	 
	               try { 
	                   System.out.println("Producing element 1"); 
	                   queue.put("Element 1"); 
	                   Thread.sleep(1000); 
	                   System.out.println("Producing element 2"); 
	                   queue.put("Element 2"); 
	                   Thread.sleep(1000); 
	                   System.out.println("Producing element 3"); 
	                   queue.put("Element 3"); 
	               } catch (InterruptedException e) { 
	 
	                   e.printStackTrace(); 
	               } 
	       } 
	   } 
	 
	   static class Consumer implements Runnable { 
	 
	       BlockingQueue<String> queue=null; 
	 
	       public Consumer(BlockingQueue queue) { 
	           super(); 
	           this.queue = queue; 
	       } 
	 
	       @Override 
	       public void run() { 
	 
	           while(true) 
	           { 
	               try { 
	                   System.out.println("Consumed "+queue.take()); 
	               } catch (InterruptedException e) { 
	                   e.printStackTrace(); 
	               } 
	           } 
	       } 
	 
	   } 
	} 
