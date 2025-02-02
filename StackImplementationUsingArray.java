package Sorting;

public class StackImplementationUsingArray {

	private int [] stackarray;
	private int top;
	
	public StackImplementationUsingArray(){
		stackarray=new int [10];
		top=-1;
	}
	public StackImplementationUsingArray(int maxsize) {
		stackarray=new int[maxsize];
		top=-1;
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==stackarray.length-1;
	}
	public void push(int x) {
		if (isFull()) {
			System.out.println("overflow");
		}
		top=top+1;
		stackarray[top]=x;
	}
	public int  pop() {
		int x;
		if(isEmpty()) {
			System.out.println("underflow");
		}
		x=stackarray[top];
		top=top-1;
		return x;
	}
	public void display() {
		System.out.println("stack using array is:");
		for (int i=top;i>=0;i--) {
			System.out.println(stackarray[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementationUsingArray stack = new StackImplementationUsingArray();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
	}

}
