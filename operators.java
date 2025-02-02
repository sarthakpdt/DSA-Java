package test_project;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic operators
		int a=20;
		int b=10;
		System.out.println("the sum is:"+(a+b)); //instead of comma we use + sign  
		System.out.println("the difference is:"+(a-b));
		System.out.println("the multiplication is:"+(a*b));
		System.out.println("the division is:"+(a/b));
		
		//relational operators
		System.out.println(a<b);
		System.out.println(a>b);
		
		//bitwise operators
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(a >> 3); //divide by 2^3
		System.out.println(a << 3); // multiply with 2^3
		
		//logical operator
		System.out.println(a> 10 && b<30);
		System.out.println(a>10 || b<30);
		
		//assignment operators
		a+=b;
		System.out.println("the sum stored in a is:"+a);
		b-=a;
		System.out.println("the difference stored in b is:"+b);
		a*=b;
		System.out.println("the multiplication stored in a is:"+a);
		b/=a;
		System.out.println("the division stored in b is:"+b);
	}

}
