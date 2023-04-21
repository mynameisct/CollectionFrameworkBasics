package com.infosys;

import java.util.ArrayList;
import java.util.Collection;

public class OperationOnCollection {

	public static void main(String[] args) {
		
		Collection<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		for(Object n : nums) {
			int num = (Integer)n;
			System.out.println(num*2);
		}
	}
}
