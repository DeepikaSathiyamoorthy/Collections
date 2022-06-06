package com.vstl.javaCollections;

import java.util.List;

public class TestListofStudents {

	public static void main(String[] args) {
		
		ListHashSetofStudents objListofStudents = new ListHashSetofStudents();
		List<String> objstudent = objListofStudents.studentList();
		System.out.println("Set Students Name List "+objstudent);
		System.out.println("--------------------");
		
		objListofStudents.removeUniqueList();
		
	}
}
