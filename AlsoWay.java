package com.infosys;

import java.util.Collection;
import java.util.TreeSet;

public class AlsoWay {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new TreeSet<>();
		nums.add(34);
		nums.add(21);
		nums.add(56);
		nums.add(21);
		nums.add(33);
		nums.add(32);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
