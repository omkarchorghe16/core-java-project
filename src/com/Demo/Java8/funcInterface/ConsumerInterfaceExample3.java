package com.Demo.Java8.funcInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample3{
	public static void main(String args[]){
		Consumer<Integer> consumer= i-> System.out.print(" "+i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen( 
				i-> System.out.print("(squre is "+i*i+")"));
		
		
		List<Integer> integerList=Arrays.asList(1, 10, 100, 200, 8, 3, 2);
		printList(integerList,consumerWithAndThen);
	}
	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
		for(Integer integer:listOfIntegers){
			consumer.accept(integer);
		}
	}
}