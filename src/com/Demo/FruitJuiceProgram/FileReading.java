package com.Demo.FruitJuiceProgram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading {

	public List<String> readFunction(){
		
		List<String> list = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("sampleinput.txt"))) {
		    String line;
			while ((line = br.readLine()) != null) {
			    	list.add(line);
			}
		} catch (FileNotFoundException e) {				
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return  list;
	}
}
