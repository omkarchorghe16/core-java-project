package com.Demo.Program;

public class ArrayUniqueElement {
	
	public static void main(String[] args) {
		ArrayUniqueElement c=new ArrayUniqueElement();
		char input[]= {'0','a','a','b','c','d','1','9','0','0','0','0'};
		char res[]=getUniqueElement(input);
		for(int i=0;i<=res.length-1;i++) {
			System.out.println(res[i]);	
		}
	}

	private static char[] getUniqueElement(char[] input) {
		// TODO Auto-generated method stub
		String s="";
		char arr[] = new char[input.length];
		//char arr[] = null;
		for(int i=0;i<=input.length-1;i++) {
			char t1=input[i];
			
			
			//System.out.println(input[i]);
			for(int j=0; j<arr.length ;j++) {
				char t2=arr[j];
				if(arr[j] != ' ') {
				if(t1==t2) {
					break;
				}else {
					arr[i]=input[i];
					
				}
				}
			}
			/*
			 * if(arr[i]==input[i]) { continue; }else { s=s+arr[i];
			 * 
			 * } System.out.println(s);
			 */
			
		}
		
		
		return arr;
	}

}
