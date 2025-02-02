package test_project;
import java.util.Scanner;//Scanner class takes input from the user in java
public class testproject { //Class is a keyword. Everything inside java should be inside a class and over here the name of the class is testproject. 
						  //Now we have something called as access modifier which is public in this case. Public class can be accessed by everyone inside the program.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Hello");
		System.out.println("World!");
		
		System.out.print("Hi");
		System.out.print("Sarthak!");
		//system isliye lagate h so that we can access the in build functionality in java 
		//out isliye lagate h to print the output on the console screen 
		//println isliye lagate h taki vo new line pr terminate ho ske
		//print isliye kagat h taki vo first aur second line ko combine krke likh ske
		
		System.out.println();
		
		Scanner scanner=new Scanner (System.in);//System.in tells the Scanner to read input from the user
		System.out.print("enter the number:");
		int num=scanner.nextInt();//nextInt se int ype ka koi bhi data read kr skte h
		System.out.print("enter the string:");
		String s=scanner.nextLine();//nextLine puri line read kr leti h aur agar sirf next likha ho to sirf phela word access kr payenge
		System.out.println("You entered the integer:"+num);
        System.out.println("You entered the string:"+s);
        scanner.close();
        //nextInt and nextLine all these are called tokanizer
        //to take float as input we use scanner.nextfloat();
   
		
	}

}
