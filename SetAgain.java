package com.infosys;

import java.util.HashSet;
import java.util.Set;

public class SetAgain {

	public static void main(String[] args) {
		
		Set<Integer> nums = new HashSet<>();
		nums.add(33);
		nums.add(34);
		nums.add(29);
		nums.add(12);
		nums.add(56);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
