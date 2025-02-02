package test_project;

import java.util.Scanner;

public class InsertionSort {

    private InsertionSort() {}

    public static void sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) { // Start from the second element
            int key = arr[i];
            int j;

            // Use a for loop for shifting elements
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j]; // Shift elements to the right
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
