package com.Demo.Program;

public class DemoSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,87,45,96,75,45,25};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
