package com.infosys;

import java.util.ArrayList;
import java.util.Collection;

public class GetThatElement {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(70);
		nums.add(50);
		nums.add(35);
		
		System.out.println(((ArrayList<Integer>) nums).get(2));
	}
}
