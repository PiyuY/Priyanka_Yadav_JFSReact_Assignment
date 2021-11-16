package com.example.JUnitQ2_MinMax;

import java.util.ArrayList;

public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int arr1[] = {12, 2, 87, 56, 41, 23, 24, 987};
        ArrayList<Integer> res1 = MinMaxFinder.findMinMax(arr1);
        System.out.println("Min Value: " + res1.get(0) + "		Max Value: " + res1.get(1));
        
        int arr2[] = {56, 34, 7 ,3, 34, 34, 53};
        ArrayList<Integer> res2 = MinMaxFinder.findMinMax(arr2);
        System.out.println("Min Value: " + res2.get(0) + "		Max Value: " + res2.get(1));
    }
}
