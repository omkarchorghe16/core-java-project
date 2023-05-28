package com.Demo.Program;

public class KeepPeekProgram {

	public static void main(String[] args) {

		// listen
		// silent

		String s1 = "keep";
		String s2 = "";
		System.out.println(s1);
		for (int i = s1.length() - 1; i >= 0; i--) {

			s2 = s2 + s1.charAt(i);
		}

		if (s1.equals(s2))
			System.out.println("sucess");

		System.out.println(s2);
		KeepPeekProgram kp = new KeepPeekProgram();
		kp.findEachContents(s1, s2);

	}

	private void findEachContents(String s1, String s2) {
		if (s1.length() == s2.length()) {

			System.out.println("contents are same");
		} else {
			System.out.println("Contents not same");
		}
	}

}
