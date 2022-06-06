package com.vstl.javaCollections;

import java.util.Hashtable;
import java.util.Map;

public class HashMapTelephoneDirectory {

	public void setDirectoryValues() {
		
		Map<Integer, HashMapDirectory> objMap = new Hashtable<Integer, HashMapDirectory>();
		
		HashMapDirectory objFirstEntry = new HashMapDirectory(101, "Hari", "Pune", 8654332455l);
		HashMapDirectory objSecondEntry = new HashMapDirectory(121, "Haran", "Delhi", 9675432456l);
		HashMapDirectory objThirdEntry = new HashMapDirectory(163, "Roja", "Chennai", 7684943245l);
		
		objMap.put(1, objFirstEntry);
		objMap.put(2, objSecondEntry);
		objMap.put(3, objThirdEntry);
		
		for(Map.Entry<Integer, HashMapDirectory> entry:objMap.entrySet())
		{
			int objKey = entry.getKey();
			HashMapDirectory objFullEntry = entry.getValue();
		
			System.out.println(objKey +"List of Directory");
			System.out.println(objFullEntry.intDoorNo + " " + objFullEntry.strName + " " + objFullEntry.strCity + " " +objFullEntry.longMobileNo);
		}
		
	}

}
