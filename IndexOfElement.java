package com.infosys;

import java.util.ArrayList;
import java.util.Collection;

public class IndexOfElement {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<>();
		
		nums.add(30);
		nums.add(32);
		nums.add(21);
		nums.add(13);
		nums.add(11);
		
		System.out.println(((ArrayList<Integer>) nums).indexOf(21));
	}
}
