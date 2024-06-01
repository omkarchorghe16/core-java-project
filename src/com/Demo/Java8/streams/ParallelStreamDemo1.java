package com.Demo.Java8.streams;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.stream.IntStream;

public class ParallelStreamDemo1 {

    public static void main(String[] args) {
    	long t1, t2;
        System.out.println("*********Sequential Execution*****");
      	IntStream range = IntStream.rangeClosed(1, 100);
      	t1 = System.currentTimeMillis();   
      	
        range.forEach(System.out::print);
        
        t2 = System.currentTimeMillis();
        System.out.println("\n Sequential Stream Time Taken: " + (t2-t1) + "\n");
        
        
        System.out.println("*********Parallel execution*******");
        IntStream range2 = IntStream.rangeClosed(1, 100);
        t1 = System.currentTimeMillis();   
        
        range2.parallel().forEach(System.out::print);
        
        t2 = System.currentTimeMillis();
        System.out.println("\n parallel Stream Time Taken: " + (t2-t1) + "\n");
        

    }

}