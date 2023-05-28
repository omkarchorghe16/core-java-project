package com.Demo.FruitJuiceProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.Demo.FruitJuiceProgram.FileReading;

public class MainApp {
	public static void main(String[] args)
    {
		FileReading file = new FileReading();
		MainApp mainApp = new MainApp();
		
		List<String> list = file.readFunction();
		
		int caloriIntake = Integer.parseInt(list.get(3));
		System.out.println("CaloriValue : "+caloriIntake);
		
		Map<Character, Integer> outputMap =  mainApp.uniqueList(list.get(1), list.get(2));
		mainApp.finalCalculation(outputMap, caloriIntake);
		
		
    }
	
	private void finalCalculation(Map<Character, Integer> outputMap, int caloriIntake){
		int count =0;
		String finalOutPut = "";
		for (Map.Entry<Character, Integer> entry : outputMap.entrySet())
		{
			if (outputMap.containsValue(caloriIntake)){				
				System.out.println(entry.getKey());				
			}else if (entry.getValue() < caloriIntake){
				count += entry.getValue();
				finalOutPut += entry.getKey();
			}
		}
		if (count == caloriIntake){
			System.out.println("Fruit Combination : " + finalOutPut);
			
		}else{
			System.out.println("SORRY, YOU JUST HAVE WATER");
		}
	}
	
	
	private Map<Character, Integer> uniqueList(String uniqueCaories, String actualFruit){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Character> uniqueFruitList = new ArrayList<Character>();
		
		String [] delimatedString = uniqueCaories.split(" ");

        char[] chars = actualFruit.toCharArray();
        Arrays.sort(chars);
        Set<Character> uniqKeys = new TreeSet<Character>();
        for(char eachChar : chars) {
        	uniqKeys.add(eachChar);
        }
        
        for (Character character : uniqKeys) {
			uniqueFruitList.add(character);
		}
        
        for (int i=0 ; i < uniqueFruitList.size();i++){
        	
        	map.put(uniqueFruitList.get(i), Integer.parseInt(delimatedString[i+1]));
        }
        System.out.println(map);
		return map;
	}
}