package com.lch920619x.TwoSum;

public class TwoSum {

	public static void main(String[] args) {
      int[] arr = {1,5,7,2,4,7,0,3,3,7,8};
      int target = 7; 
      FindTwo finder = new FindTwo();
      int[] index = finder.find(arr, target);
      for (int i:index) {
      System.out.println(i);
      }

	}

}
