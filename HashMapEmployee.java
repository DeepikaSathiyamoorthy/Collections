package com.vstl.javaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmployee {

	public HashMap<String, String> hashMapforEmpPersonalDetails() {
		
		HashMap<String, String> objHashMap = new HashMap<String, String>();
		
		objHashMap.put("Emp1092", "Radha");
		objHashMap.put("Emp1093", "Sita");
		objHashMap.put("Emp1094", "Divya");
		objHashMap.put("Emp1095", "Mona");
		
		System.out.println("List of Employee Names with EmpID" +objHashMap.toString());
		
		for(Map.Entry m:objHashMap.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		
		objHashMap.remove("1093");
		for(Map.Entry m:objHashMap.entrySet()){    
		       System.out.println("Updated List "+m.getKey()+" "+m.getValue());    
		      }  
		
	return objHashMap;
		
		
	}
	
}
