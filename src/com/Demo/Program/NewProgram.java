package com.Demo.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NewProgram {

	/*
	 * ABC -> ABC,CAB,BCA
	 * 
	 * AB-> AB,BA DD -> DD
	 */
	
	public static void main(String[] args) {

		List<String> input =Arrays.asList("ABC","AB","CAB","BA","BCA","DD");
		
		Map<String,List<String>> output=new HashMap<String, List<String>>();
		List<String> subOPString =new ArrayList<String>();
		String key="";
		for(int i=0;i<input.size();i++) {
			key=input.get(i);
			
				for(int j=0;j<key.length();j++) {
					char c=key.charAt(j);
					if(key.contains(c+"")) {
						//continue;
						if(j==key.length()-1) {
							subOPString.add(input.get(i));
						}
					}
					
				}
				output.put(key, subOPString);	
		}
		
		//System.out.println(output);
		for(Entry<String,List<String>> entry: output.entrySet()) {
			System.out.println("key="+entry.getKey()+" | value="+entry.getValue());
		}
	}

}
