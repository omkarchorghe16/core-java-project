package com.Demo.Program;

public class LoopPrograms {

	public static void main(String[] args) {
		//Output - 1,2,4,8,16,32,64,128,256,512,1024
		System.out.println("------------using for loop---------------------");
		int count =1;
		for(int i=0 ;i<=10 ;i++) {
			System.out.print(count +",");
			count = count*2;
			
		}
		System.out.println();
		System.out.println("------------using while loop---------------------");
		count =1;
		int num =1;
		while(num <= 10) {
			System.out.print(count +",");
			count = count*2;
			num++;
		}

	}

}
