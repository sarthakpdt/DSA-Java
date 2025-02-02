package Sorting;

public class QueueUsingLinkedList {
	
	private node front;
	private node rare;
	
	public QueueUsingLinkedList() {
		front=null;
		rare=null;
	}
	
	public void enqueue(int x) {
		node temp=new node (x);
		temp.link=null;
		if (front==null) {
			front=temp;
			rare=temp;
			System.out.println("the number enqueued is:"+x);
		}
		else {
			rare.link=temp;
			rare=temp;
			System.out.println("the number enqueued is:"+x);
		}
	}
	
	public void dequeue() {
		int x=front.info;
		System.out.println("the number dequeued is:"+x);
		front=front.link;
	}
	
	public void display() {
		node front=null;
		node rare=null;
		while(rare!=null) {
			System.out.println(rare.info+" ");
			rare=rare.link;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		queue.dequeue();
	}

}
