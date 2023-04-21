package com.infosys;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
	java.util.List<Integer> nums = new ArrayList<>();
	nums.add(12);
	nums.add(32);
	nums.add(11);
	nums.add(22);
	nums.add(12);
	
	for(Object n : nums){
		int num = (Integer)n;
		System.out.println(num*2);
		}
	}
}
