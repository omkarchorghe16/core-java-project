package com.Demo.CoreJava;

public class FloatingNumberPrograms {
	public static void main(String[] args) {

		double avg;
		int rating = 13;
		int gmailCount = 3;
		double avg1 = rating / gmailCount;
		Double dd = (double) (rating / gmailCount);
		System.out.println("avg1=" + avg1);
		System.out.println("dd=" + dd);
		System.out.println("---------------------------------");
		double tmpX = (new Integer(rating)).doubleValue();
		double tmpY = (new Integer(gmailCount)).doubleValue();

		Double d2 = Double.valueOf(tmpX / tmpY);
		Double d = tmpX / tmpY;
		// double ddd = dd.doubleValue();
		System.out.println("d2=" + d2);
		System.out.println("d=" + d);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
