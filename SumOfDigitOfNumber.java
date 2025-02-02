package Sorting;
import java.util.Scanner;
public class SumOfDigitOfNumber {
	
	public void sum(int num) {
		int a=0;
		int b=0;
		while (num!=0) {
			a=num%10;
			b=a+b;
			num=num/10;
		}
		System.out.println("the sum of the digits by fn is:"+b);
	}
	
	public int factsum(int num) {
		if (num/10==0) {
			return num;
		}
		return factsum(num/10)+num%10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitOfNumber obj =new SumOfDigitOfNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int x=scanner.nextInt();
		obj.sum(x);
		int factsum=obj.factsum(x);
		System.out.println("the sum of the digit by factorial is:"+factsum);
		scanner.close();
	}

}
