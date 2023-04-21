package com.infosys;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionForEach {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
