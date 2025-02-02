package Sorting;

import java.util.Scanner;

public class CircularLinkedList {
	private node start;

    public void displayList() {
        if (start == null) {
            System.out.println("The linked list is empty");
            return;
        }
        System.out.println("The linked list is:");
        node p = start;
        node q=start;
        do {
            System.out.print(p.info + "->");
            p = p.link;
        } while (p != start);
        System.out.println(q.info);
    }
 public void insertAtEnd(int data) {
        node pnode = new node(data);
        if (start == null) { 
            start = pnode;
            pnode.link=start;
            return;
        }
        node p = start;
        while (p.link != start) {
        	p = p.link;
        }
        p.link = pnode;
        pnode.link=start;
    }
 public void insertatbeg(int data) {
	 	node pnode=new node(data);
	 	node p = start;
        while (p.link != start) {
            p = p.link;
        }
	 	pnode.link=start;
	 	p.link=pnode;
	 	start=pnode;
 }
 public void dltatbeg() {
	 	node p=start;
	 	while (p.link!=start){
	 		p=p.link;
	 	}
	 	p.link=start.link;
	 	start=start.link;
 }
public static void main(String[] args) {
	CircularLinkedList list = new CircularLinkedList();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of the linked list:");
    int n=sc.nextInt();
    
    for (int i=0;i<n;i++) {
    	System.out.print("Enter the number:");
    	int data=sc.nextInt();
    	list.insertAtEnd(data);
    }
    System.out.println("the circular linked list is:");
    list.displayList();
    System.out.println("enter the number to be entered in the beg of the circular linked list:");
    int data=sc.nextInt();
    list.insertatbeg(data);
    list.displayList();
    System.out.println("the circular linked list after deletion of the first node is:");
    list.dltatbeg();
    list.displayList();
    sc.close();
}
}