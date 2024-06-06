package com.Demo.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OldTryWithResource {

	public OldTryWithResource() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = null;
		try {
		    scanner = new Scanner(new File("test.txt"));
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    if (scanner != null) {
		        scanner.close();
		    }
		}

		
		
		String path = "test.txt";
		FileReader fr = new FileReader(path );
	    BufferedReader br = new BufferedReader(fr);
	    try {
	        br.readLine();
	    } finally {
	        br.close();
	        fr.close();
	    }
	    
	}

}
