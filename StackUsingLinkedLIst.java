package Sorting;

public class StackUsingLinkedLIst {
	
	private node top;
	
	public StackUsingLinkedLIst() {
		top=null;
	}
	
	public int size() {
		int s=0;
		node p=top;
		while (p!=null) {
			p=p.link;
			s++;
		}
		return s;
	}
	
	public void push(int x) {
		node temp=new node (x);
		temp.link=top;
		top=temp;
	}
	
	public int pop() {
		int x=top.info;
		top=top.link;
		return x;
	}
	
	public void display() {
		System.out.println("stack using linked list is:");
		node p=top;
		while (p!=null) {
			System.out.println(p.info+" ");
			p=p.link;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedLIst stack = new StackUsingLinkedLIst();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();
	}

}
