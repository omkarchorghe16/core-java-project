package com.Demo.InterviewProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GSLabProgram {

	public static void main(String[] args) {

		String ip = "test";
		System.out.println("ip.hashCode() =" + ip.hashCode());
		String s = new String("test");
		String s1 = new String("test");
		System.out.println(ip.equals(s) + " -" + (ip == s) + "- " + s.hashCode());
		System.out.println(s.equals(s1) + " -" + (s == s1) + "- " + s1.hashCode());

		System.out.println("------------------------------------------------");
		//Give addition of numbers then give 1st digit of it
		String input = "1234";
		int res = againAdd(input);
		System.out.println("Single digit no :" + res);

		System.out.println("------------------------------------------------");
		// find 1st repetative string
		String str = "AA BB AA CC CC BB DD BB";
		FirstRepetativeString(str);
		System.out.println("------------------------------------------------");

	}

	private static void FirstRepetativeString(String str) {
		String arr[] = str.split(" ");
		List list = Arrays.asList(arr);
		System.out.println("***********By HashMap********************");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (map.containsKey(arr[i])) {
				System.out.println("FirstRepetativeString is =" + arr[i]);
				// or map.getKey();
				break;
			} else {
				map.put(arr[i], count++);
			}
		}
		System.out.println("*************By HashSet******************");
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				System.out.println("FirstRepetativeString is =" + arr[i]);
				// or map.getKey();
				break;
			} else {
				set.add(arr[i]);
			}
		}
	}

	public static int againAdd(String input) {
		int sum = 0;
		Integer res = 0;
		for (int i = 0; i < input.length(); i++) {
			// if(input.charAt(i).isNum())
			// Need to change it to number insted of ASCII value
			Integer c = (int) input.charAt(i);
			res = res + c;
			System.out.println("c=" + input.charAt(i));
			System.out.println("res=" + res);
			/*
			 * if(sum>9) { againAdd(sum+""); }else { return sum; }
			 */
			// System.out.println(res);
		}
		System.out.println(res);
		return res;
	}

}
