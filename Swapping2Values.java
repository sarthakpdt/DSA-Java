package test_project;
import java.util.Scanner;
public class Swapping2Values {
	
	public static void swap(int a,int b) {
		System.out.println("the value of a before swapping is:"+a);
		System.out.println("the value of b before swapping is:"+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("the value of a after swapping is:"+a);
		System.out.println("the value of b after swapping is:"+b);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.print("enter the first number:");
		int num1=scanner.nextInt();
		System.out.print("enter the second number:");
		int num2=scanner.nextInt();
		swap(num1,num2);
		scanner.close();
	}
	
}
