package com.Demo.Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GSLabProgram {

	public static void main(String[] args) {
		
		String ip="test";
		System.out.println(ip.hashCode());
		String s=new String("test");
		String s1=new String("test");
		System.out.println(ip.equals(s)+" -"+(ip == s)+"- "+s.hashCode());
		System.out.println(s.equals(s1)+" -"+(s == s1)+"- "+s1.hashCode());

		System.out.println("------------------------------------------------");
		String input="1234";
		
		int res=againAdd(input);
		System.out.println("Single digit no :"+res);

		System.out.println("------------------------------------------------");
		//find 1st repetative string
		String str="AA BB AA CC CC BB DD BB";
		FirstRepetativeString(str);
		System.out.println("------------------------------------------------");
		
		
		
	}

	private static void FirstRepetativeString(String str) {
		// TODO Auto-generated method stub
		String arr[]=str.split(" ");

		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++){
		int count=0;
			if(map.containsKey(arr[i])){
				System.out.println(arr[i]);
				//or map.getKey();
				break;
			}else{
				map.put(arr[i],count++);
			}
		}
		System.out.println("*******************************");
		Set<String> set=new HashSet<String>();
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i])){
				System.out.println(arr[i]);
				//or map.getKey();
				break;
			}else{
				set.add(arr[i]);
			}
		}
	}

	public static int againAdd(String input) {
		// TODO Auto-generated method stub
		int sum=0;
		int res=0;
		for(int i=0;i<input.length()-1;i++) {
			char c=input.charAt(i);
			res=res+(Integer.parseInt(input));
			System.out.println(res);
			
			/*
			 * if(sum>9) { againAdd(sum+""); }else { return sum; }
			 */
			//System.out.println(res);
		}
		return res;
	}

}
