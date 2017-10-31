package com.lch920619x.TwoSum;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
      List<Integer> arrList=  new ArrayList<Integer>();
      Integer[] arr=  new Integer[10];
      Scanner sc = new Scanner(System.in);
      System.out.println("Your Array, end with empty line:");
      String input = new String();
      while (true) {
    	  input = sc.nextLine();
    	  if (input.equals("")) {
    		  break;
    	  }
      arrList.add(Integer.parseInt(input));
      }
      System.out.println("Your Target:");
      int target = sc.nextInt(); 
      FindTwo finder = new FindTwo();
      int[] index = finder.find((Integer[])arrList.toArray(arr), target);
      for (int i:index) {
      System.out.println(i);
      }

	}

}
