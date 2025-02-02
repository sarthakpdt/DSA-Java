package test_project;
import java.util.Scanner;

public class SelectionSort {
	
	private SelectionSort() {
		
	}
	
	public static void sort(int[] arr,int n) {
		for (int i=0;i<n;i++) {
			int minindex=i;
			for (int j=i;j<n;j++) {
				if (arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			if (minindex!=i) {
				int temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]=temp;
			}
		}
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
