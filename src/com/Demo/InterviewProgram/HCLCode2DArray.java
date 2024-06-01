package com.Demo.InterviewProgram;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class HCLCode2DArray {

	public static void main(String[] args) {
		
		//remove duplicate elements from bidirectional array
		//[ [1,2,6], [3,4,5], [5,6,1,[7,8]],[9,10] ]
		//[1,2,3,4,5,6,7,8,9,10];
		
		int arr [][] = {{1,2,6}, {3,4,5}, {5,6,1},{7,8},{9,10}};
		
		Set set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]);
				set.add(arr[i][j]);
			}
		}
		System.out.println("Set ="+set);
		System.out.println("-------------------------------------------------------");
		int mat[][] = { {10, 20, 30, 40, 50, 60, 70, 80, 90},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50, 51, 89},
              };


	    for(int i=0; i<mat.length; i++) {
	        for(int j=0; j<mat[i].length; j++) {
	            System.out.println("Values at arr["+i+"]["+j+"] is "+mat[i][j]);
	        }
	    }
    

	}

}
