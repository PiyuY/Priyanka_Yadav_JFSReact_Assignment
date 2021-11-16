package com.example.JUnitQ2_MinMax;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxFinder {
	
	public static ArrayList<Integer> findMinMax(int arr[]) {
		Arrays.sort(arr);
		ArrayList<Integer> minMax = new ArrayList<Integer>();
	
		
		// adding smallest value
		minMax.add(arr[0]);
		
		// adding greatest value
		minMax.add(arr[arr.length-1]);
		
		return minMax;

	}
	
}
