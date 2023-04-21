package com.infosys;

import java.util.Set;
import java.util.TreeSet;

public class SortedAndSet {

	public static void main(String[] args) {
		
		Set<Integer> nums = new TreeSet<>();
		nums.add(75);
		nums.add(34);
		nums.add(56);
		nums.add(78);
		nums.add(46);
		nums.add(64);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
