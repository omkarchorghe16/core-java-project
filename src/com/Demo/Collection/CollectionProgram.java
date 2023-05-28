package com.Demo.Collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CollectionProgram {

	public static void main(String[] args) throws Exception {

		/*
		 * List<Entity> entityListValues=new ArrayList<Entity>();
		 * entityListValues=getAllEntityValues();
		 * getUniqueObjectTimeStamp(entityListValues);
		 * getUniqueObjectTimeStampWithHashMap(entityListValues);
		 */
		
		File f=new File("E:\\Java-Docs\\Lalit-Doc\\BBD-Program.txt");
		FileReader fr=new FileReader(f);
		Scanner s=new Scanner(f);
		while(s.hasNext()) {
			System.out.println(s.nextLine());
		}
	}

	private static void getUniqueObjectTimeStampWithHashMap(List<Entity> entityListValues) {
		// TODO Auto-generated method stub
		int len=entityListValues.size();
		HashMap map=new HashMap();
		for(int i=0;i<len;i++) {
			Entity en=entityListValues.get(i);

			int code=en.getEntityCode();
			map.put(code, en.getTimeStamp());

			if(map.containsKey(code) && map.get(code).equals(en.getTimeStamp())) {
				
				int timeStampTemp=Integer.parseInt(map.get(code).toString());
				int currentTimeStamp=Integer.parseInt(en.getTimeStamp());
				if(currentTimeStamp>timeStampTemp) {
					map.put(code, en.getTimeStamp());

				}
				
			}

		}
		System.out.println("with hasmap solution 2 = "+map);
	}

	private static List<Entity> getAllEntityValues() {
		// TODO Auto-generated method stub
		List<Entity> entityList=new ArrayList<Entity>();

		Entity e1=new Entity(1,1,"100");
		entityList.add(e1);
		Entity e2=new Entity(2,1,"105");
		entityList.add(e2);
		Entity e3=new Entity(3,2,"110");
		entityList.add(e3);
		Entity e4=new Entity(4,3,"115");
		entityList.add(e4);
		Entity e5=new Entity(5,2,"120");
		entityList.add(e5);
		Entity e6=new Entity(6,4,"125");
		entityList.add(e6);
		Entity e7=new Entity(7,5,"130");
		entityList.add(e7);
		return entityList;
	}

	public static void getUniqueObjectTimeStamp(List<Entity> entityList) {
		
		int len=entityList.size();
		//System.out.println("data len:"+len);
		HashMap<Integer,String> list=new HashMap<Integer,String>();
		for(int i=0;i<len;i++) {
			
			Entity et=entityList.get(i);
			int code=et.getEntityCode();
			
			for(int j=i+1;j<len-i;j++) {
				
				Entity et1=entityList.get(j);
				int code1=et1.getEntityCode();
				
				
				if(code==code1) {
					if(et.getEntityCode()>et1.getEntityCode()) {
						list.put(code,et.getTimeStamp());
					}else {
						list.put(code1,et1.getTimeStamp());
					}
					
				}else {
					
				}
			}
		
			if(list.containsKey(code)) {
			
			}else {
			//System.out.println(" unique code "+code+",TimeStamp="+et.getTimeStamp());
			list.put(code,et.getTimeStamp());
			}
		}
		System.out.println("final list with solution 1 ="+list);
	}
}
