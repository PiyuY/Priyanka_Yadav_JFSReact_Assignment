package com.example.JUnitQ1_MinMax;

public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int arr1[] = {12, 2, 87, 56, 41, 23, 24, 987};
        int res1[] = MinMaxFinder.findMinMax(arr1);
        System.out.println("Min Value: " + res1[0] + "		Max Value: " + res1[1]);
        
        int arr2[] = {56, 34, 7 ,3, 34, 34, 53};
        int res2[] = MinMaxFinder.findMinMax(arr2);
        System.out.println("Min Value: " + res2[0] + "		Max Value: " + res2[1]);
    }
}
