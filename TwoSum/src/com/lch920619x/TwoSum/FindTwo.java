package com.lch920619x.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class FindTwo {

	public int[] find(Integer[] arr, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i< arr.length;i++) {
			if(map.containsKey(target-arr[i])) {
				int[] index = {map.get(target-arr[i]), i};
				return index;
			};
			map.put(arr[i], i);
			
		}
		
		return new int[]{-1,-1};
	}
}
