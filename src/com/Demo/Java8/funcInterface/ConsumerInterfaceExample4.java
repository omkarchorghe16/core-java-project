package com.Demo.Java8.funcInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample4 {
	public static void main(String[] args) {
		Consumer<Integer> display = a -> System.out.println(a); 
		display.accept(10); 
		
		List<Integer> list = new ArrayList<Integer>(); 
        list.add(5); 
        list.add(2); 
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(3);
        
        Consumer<List<Integer> > modify = aList -> 
        { 
            for (int i = 0; i < aList.size(); i++) 
            	aList.set(i, 2 * aList.get(i)); 
        }; 
        Consumer<List<Integer>> dispList = aList -> aList.stream().forEach(a -> System.out.print(a + " ")); 
        modify.andThen(dispList).accept(list); 
	}
}
