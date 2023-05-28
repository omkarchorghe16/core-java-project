package com.Demo.Program;

public class PrimeBinaryNumber {

	public static void main(String[] args) {
		PrimeBinaryNumber n=new PrimeBinaryNumber();
		String num="101010101001001";
		n.findBinaryNumber(num);
		
		System.out.println("----------------------------------------");
		for(int i=0;i<50;i++) {
		n.printAllPrimeNumbersList(i);
		}
		System.out.println("----------------------------------------");
		
	}

	private void findBinaryNumber(String num) {
		boolean binary=true;
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c == '0' || c == '1') {

			} else {
				binary=false;
				System.out.println("Not binary");
				break;
			}
		}
		if(binary)
			System.out.println("binary number");
		/*
		 * if(!(num.contains("0") || num.contains("1"))){
		 * System.out.println("not binary"); }else {
		 * System.out.println("binary number"); }
		 */
	}



	private void printAllPrimeNumbersList(int n) {
		int i, m = 0, flag = 0;
		//int n = 3;// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			//System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					//System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}

			}
			  if(flag==0)  { System.out.println(n+" is prime number"); }  
		}
	}
}
