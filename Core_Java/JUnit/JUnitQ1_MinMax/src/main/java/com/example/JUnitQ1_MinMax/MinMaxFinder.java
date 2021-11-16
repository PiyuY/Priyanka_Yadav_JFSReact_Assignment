package com.example.JUnitQ1_MinMax;

import java.util.Arrays;

public class MinMaxFinder {
	
	public static int[] findMinMax(int arr[]) {
		int minMax[] = new int[2];
		Arrays.sort(arr);
		
		// adding smallest value
		minMax[0] = (arr[0]);
		
		// adding greatest value
		minMax[1] = arr[arr.length-1];
		
		return minMax;
	}
	
}
