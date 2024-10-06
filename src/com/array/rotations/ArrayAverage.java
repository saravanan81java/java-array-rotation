package com.array.rotations;

public class ArrayAverage {
	
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = 1+i;
        }
        
        // Calculate sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        // Calculate average
        double average = (double) sum / n;
        
        // Output the average
        System.out.println("The average is: " + average);
        
	}

}
