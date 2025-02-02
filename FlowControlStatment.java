package test_project;

public class FlowControlStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		float b=30.34f;
		if (a>b) {
			System.out.println("value of a is greater");
		}
		else if (a==b) {
			System.out.println("value of a is equal to b");
		}
		else {
			System.out.println("value of b is greater");
		}
		int c=1;
		while (c!=5) {
			System.out.println(c);
			c++;
		}
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
