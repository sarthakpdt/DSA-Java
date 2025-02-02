package Sorting;

public class QueueUsingArray {

	private int[] queuearray;
	private int front;
	private int rare;
	
	public QueueUsingArray() {
		queuearray=new int[10];
		front=-1;
		rare=-1;
	}
	
	public boolean isfull() {
		return rare==queuearray.length-1;
	}
	
	public boolean isempty() {
		return front==-1;
	}
	public void enqueue(int x) {
		if (isfull()) {
			System.out.println("queue full");
		}
		else {
			if (front==-1) {
				front++;
				rare++;
				queuearray[rare]=x;
			}
			else {
				rare++;
				queuearray[rare]=x;		
			}
		}
	}
	public void dequeue() {
		if (isempty()) {
			System.out.println("queue is empty");
		}
		else {
			int x=queuearray[front];
			front++;
			System.out.println("The no dequeued is:"+x);
		}
	}
	public void display() {
		System.out.println("queue using array is:");
		for (int i=0;i<=rare;i++) {
			System.out.print(queuearray[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray queue=new QueueUsingArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		System.out.println();
		queue.dequeue();
		queue.dequeue();
	}

}
