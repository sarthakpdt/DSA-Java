package test_project;
import java.util.Scanner;

public class BubbleSort {
	
	private BubbleSort() {}
	
	public static void sort(int[] arr,int n) {
		for (int i=0;i<n-1;i++) {
			for (int j=0;j<n-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=scanner.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr,n);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
	}

}
