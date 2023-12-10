package com.Demo.Java8.streams;
import java.util.stream.IntStream;

public class ParallelStreamDemo1 {

    public static void main(String[] args) {

        System.out.println("*********Sequential Execution*****");
      	IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("*********Parallel execution*******");
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);
        
        

    }

}