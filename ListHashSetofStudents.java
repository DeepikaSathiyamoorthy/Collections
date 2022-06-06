package com.vstl.javaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListHashSetofStudents {

	
	public List<String> studentList() {
		
		List<String> objstrName = new ArrayList<String>();
		
		objstrName.add("Ratheesh");
		objstrName.add("Ridhu");
		objstrName.add("Deepika");
		objstrName.add("Suba");
		objstrName.add("Sri");
		objstrName.add("Chintu");
		objstrName.add("Mintu");
		objstrName.add("Sri");
		objstrName.add("Deepika");
		objstrName.add("Sai");
		
		
		System.out.println("Array List of Students :" +objstrName.toString());	
		return objstrName;
	}
			
	
	public void removeUniqueList() {
		
		HashSet<String> objsetName = new HashSet<String>();
		objsetName.add("Ratheesh");
		objsetName.add("Suba");
		objsetName.add("Sri");
		objsetName.add("Suba");
		objsetName.add("Deepika");
		
		System.out.println("Set Data using Hash Set : " +objsetName.toString());
		
		objsetName.remove("Ratheesh");
		System.out.println("Removed Name : " +objsetName.toString());
		
		objsetName.add("Ridhu");
		objsetName.add("Deepika"); // its again a Duplicate value so it will not be added in the list
		objsetName.addAll(objsetName);
		System.out.println("Set Data using Hash Set : " +objsetName.toString());
		
		objsetName.removeIf(str->str.contains("Deepika"));
		System.out.println("One Name Removed : " +objsetName);
		
	}
	
}
