package com.Demo.Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("c");
		p.add("java");
		p.add("unix");
		p.add("compiler");
		//p.remove();
		//p.remove();
		//p.poll();
		p.peek();
		System.out.println(p);
		
	}

}
