package Sorting;

public class CircularQueue {
	
	private node front;
	private node rare;
	
	public CircularQueue() {
		front=null;
		rare=null;
	}
	
	public void enqueue(int x) {
		node temp=new node (x);
		temp.link=null;
		if (front==null) {
			front=temp;
			rare=temp;
			rare.link=front;
			System.out.println("the number enqueued is:"+x);
		}
		else {
			rare.link=temp;
			rare=temp;
			rare.link=front;
			System.out.println("the number enqueued is:"+x);
		}
	}
	
	public void dequeue() {
		int x=front.info;
		System.out.println("the number dequeued is:"+x);
		front=front.link;
	}
	
	public void display() {
		node temp=front;
		while(temp!=front) {
			System.out.println(temp.info+" ");
			temp=temp.link;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue queue=new CircularQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		queue.dequeue();
	}

}
