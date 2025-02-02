package test_project;
import java.util.Scanner;

public class Functions {
	public static void add(int num1, int num2) {
		System.out.println("the sum of the numbers is:"+(num1+num2));
	}
	public static int sum(int num1,int num2) {
		int res=num1+num2;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		System.out.print("enter the first number:");
		int num1=scanner.nextInt();
		System.out.print("enter the second number:");
		int num2=scanner.nextInt();
		System.out.print("the sum through void fn:");
		add(num1,num2);
		System.out.print("the sum through int fn is:"+sum(num1,num2));
		scanner.close();
	}

}
