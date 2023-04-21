package com.infosys;

import java.util.Collection;
import java.util.TreeSet;

public class Iterator {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new TreeSet<>();
		nums.add(44);
		nums.add(33);
		nums.add(32);
		nums.add(35);
		nums.add(21);
		nums.add(77);
		nums.add(22);
		
		java.util.Iterator<Integer> values = nums.iterator();
		
		while(values.hasNext()) {
			System.out.println(values.next());
		}
	}
}
