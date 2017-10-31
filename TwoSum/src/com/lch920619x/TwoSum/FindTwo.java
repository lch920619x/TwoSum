package com.lch920619x.TwoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTwo {

	public int[] find(List<Integer> arr, int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i< arr.size();i++) {

		/*	System.out.println(arr.size());
			System.out.println("arr="+arr.get(i));
			System.out.println("i="+i);
			*/
			if(map.containsKey(target-arr.get(i))) {
				int[] index = {map.get(target-arr.get(i)), i};
				return index;
			};
			map.put(arr.get(i), i);
			
		}
		
		return new int[]{-1,-1};
	}
}
