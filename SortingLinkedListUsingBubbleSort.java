package Sorting;

import java.util.Scanner;

class node {
    int info;
    node link;

    node(int info) {
        this.info = info;
        this.link = null;
    }
}

public class SortingLinkedListUsingBubbleSort {
	    private node start;

	    public void displayList() {
	        if (start == null) {
	            System.out.println("The linked list is empty");
	            return;
	        }
	        System.out.println("The linked list is:");
	        node p = start;
	        while (p != null) {
	            System.out.print(p.info + "->");
	            p = p.link;
	        }
	        System.out.println("NULL");
	    }
	 public void insertAtEnd(int data) {
	        node pnode = new node(data);
	        if (start == null) { 
	            start = pnode;
	            return;
	        }
	        node p = start;
	        while (p.link != null) {
	        	p = p.link;
	        }
	        p.link = pnode;
	    }
	 public void bubblesort() {
		 node p,q,end;
		 for (end=null;end!=start.link;end=p) {
			 for (p=start;p.link!=end;p=p.link) {
				 q=p.link;
				 if (p.info>q.info) {
					 int temp=p.info;
					 p.info=q.info;
					 q.info=temp;
				 }
			 }
		 }
	 }
	public static void main(String[] args) {
		SortingLinkedListUsingBubbleSort list = new SortingLinkedListUsingBubbleSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the linked list:");
        int n=sc.nextInt();
        
        for (int i=0;i<n;i++) {
        	System.out.print("Enter the number:");
        	int data=sc.nextInt();
        	list.insertAtEnd(data);
        }
        System.out.println("The Linked List before bubble sort is:");
        list.displayList();
		list.bubblesort();
		System.out.println("The linked list after bubble sort is:");
		list.displayList();
		sc.close();
	}
}

