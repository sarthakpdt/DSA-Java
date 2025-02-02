package Sorting;

public class PriorityQueue {
	
	private node front;
	private node rare;
	private node pri;
	
	public PriorityQueue() {
		front=null;
		rare=null;
		pri=null;
	}
	
	public void enqueue(int x,int p) {
		node temp=new node(x);
		node priority=new node(p);
		temp.link=null;
		if (front==null || front.priority>pri) {
			front=temp;
			rare=temp;
			System.out.println("the number entered is:"+x);
			System.out.println("the priority of the number entered is:"+p);
		}
		else {
			rare.link=temp;
			rare=temp;
			System.out.println("the number entered is:"+x);
			System.out.println("the priority of the number entered is:"+p);
		}
	}
	
	public void dequeue() {
		int data=front.x;
		int x=front.pri;
		front=front.link;
		System.out.println("the number dequeued is:"+x);
		System.out.println("the priority of the number dequeued is:"+pri);
	}
	
	public void display() {
		node temp=front;
		System.out.println("the data is:"+temp.x);
		System.out.println("the priority is:"+temp.pri);
		temp=temp.link;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue pq = new PriorityQueue();
	        pq.enqueue(10, 3);
	        pq.enqueue(20, 2);
	        pq.enqueue(30, 1);
	        pq.enqueue(40, 4);

	        pq.display();

	        pq.dequeue();
	        pq.display();

	        pq.dequeue();
	        pq.display();
	}

}
