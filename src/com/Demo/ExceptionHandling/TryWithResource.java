package com.Demo.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResource {

	public TryWithResource() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("resources/tmp.txt");
		try (FileInputStream inputStream = new FileInputStream(file);) {
			// use the inputStream to read a file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException :"+e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException :"+e.getMessage());
		}

		System.out.println("============================================== :");
		
		try (PrintWriter writer = new PrintWriter(new File("resources/test.txt"))) {
		    writer.println("Hello World");
		}
		
		System.out.println("============================================== :");
		
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException fnfe) {
		    fnfe.printStackTrace();
		}
		System.out.println("============================================== :");
		
		String line;
	    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
	      while ((line = br.readLine()) != null) {
	        System.out.println("Line =>"+line);
	      }
	    } catch (IOException e) {
	      System.out.println("IOException in try block =>" + e.getMessage());
	    }
		System.out.println("============================================== :");
		
	}

}
