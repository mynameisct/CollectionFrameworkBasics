package com.infosys;

import java.util.HashSet;
import java.util.Set;

public class LetsSet {

	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		nums.add(12);
		nums.add(23);
		nums.add(34);
		nums.add(23);
		nums.add(55);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
