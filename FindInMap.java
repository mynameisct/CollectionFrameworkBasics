package com.infosys;

import java.util.HashMap;
import java.util.Map;

public class FindInMap {

	public static void main(String[] args) {
		
		Map<String,Integer> students = new HashMap<>();
		
		students.put("Chaitanya",89);
		students.put("Abhishek",78);
		students.put("Apurva",55);
		students.put("Saurabh",65);
		students.put("Nikhil",53);
		
		System.out.println(students.get("Nikhil"));
	}
}
