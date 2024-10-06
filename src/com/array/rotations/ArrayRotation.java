package com.array.rotations;

public class ArrayRotation {
	public static void rotateRight(int[] arr, int n) {
        int len = arr.length;
        if (len == 0 || n % len == 0) {
            return; // No rotation needed
        }
        n = n % len; // To handle n greater than length
        reverse(arr, 0, len - 1); // Reverse the whole array
        reverse(arr, 0, n - 1); // Reverse the first part
        reverse(arr, n, len - 1); // Reverse the second part
    }

    // Method to rotate an array to the left by n positions
    public static void rotateLeft(int[] arr, int n) {
        int len = arr.length;
        if (len == 0 || n % len == 0) {
            return; // No rotation needed
        }
        n = n % len; // To handle n greater than length
        reverse(arr, 0, n - 1); // Reverse the first part
        reverse(arr, n, len - 1); // Reverse the second part
        reverse(arr, 0, len - 1); // Reverse the whole array
    }

    // Helper method to reverse elements in an array between two indices
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrRight = {1, 2, 3, 4, 5};
        int[] arrLeft = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Original array:");
        printArray(arrRight);

        rotateRight(arrRight, n);
        System.out.println("Array after right rotation by " + n + " positions:");
        printArray(arrRight);

        rotateLeft(arrLeft, n);
        System.out.println("Array after left rotation by " + n + " positions:");
        printArray(arrLeft);
    }
}
