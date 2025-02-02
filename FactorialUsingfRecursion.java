package Sorting;

import java.util.Scanner;

public class FactorialUsingfRecursion {

	long factorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsingfRecursion obj = new FactorialUsingfRecursion();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		int number=scanner.nextInt();
		long result=obj.factorial(number);
		System.out.println("the factorial of the number is:"+result);
		scanner.close();
	}

}
