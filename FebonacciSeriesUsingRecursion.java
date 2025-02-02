package Sorting;
import java.util.Scanner;
public class FebonacciSeriesUsingRecursion {

	public int feb(int num) {
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		else {
			return feb(num-1)+feb(num-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FebonacciSeriesUsingRecursion obj=new FebonacciSeriesUsingRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=scanner.nextInt();
		for (int i=1;i<=number;i++){
            System.out.print(obj.feb(i) + " ");
        }
		scanner.close();
	}
}
