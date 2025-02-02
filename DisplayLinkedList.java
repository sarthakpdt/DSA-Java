package test_project;

import java.util.Scanner;

class Node {
    int info;
    Node link;

    Node(int info) {
        this.info = info;
        this.link = null;
    }
}

public class DisplayLinkedList {
    private Node start;

    public void displayList() {
        if (start == null) {
            System.out.println("The linked list is empty");
            return;
        }
        System.out.println("The linked list is:");
        Node p = start;
        while (p != null) {
            System.out.print(p.info + "->");
            p = p.link;
        }
        System.out.println("NULL");
    }
    public void CountNode() {
    	int n=0;
    	Node p=start;
    	while (p!=null) {
    		n++;
    		p=p.link;
    	}
    	System.out.println("the number of node in the linked list are:"+n);
    }
    public void insertatbeg(int data) {
    	Node pnode=new Node(data);
    	pnode.link=start;
    	start=pnode;
    }
    public void insertAtEnd(int data) {
        Node pnode = new Node(data);
        if (start == null) { 
            start = pnode;
            return;
        }
        Node p = start;
        while (p.link != null) {
        	p = p.link;
        }
        p.link = pnode;
    }
    public void insertafternode(int data,int x) {
        Node p = start;
        while (p !=null) {
        	if (p.info==x) {
        		break;
        	}
        	p = p.link;
        }
        Node pnode = new Node(data);
        pnode.link=p.link;
        p.link=pnode;
    }
    public void insertbeforenode(int data,int x) {
    	Node p=start;
    	Node prev=null;
    	while (p!=null) {
    		if (p.info==x) {
    			break;
    		}
    		prev=p;
    		p=p.link;
    	}
    	Node pnode=new Node(data);
    	prev.link=pnode;
    	pnode.link=p;
    }
    public void deleteatbeg() {
    	start=start.link;
    
    }
    public void deleteatend() {
    	Node p=start;
    	while (p.link.link!=null) {
    		p=p.link;
    	}
    	p.link=null;
    }
    public static void main(String[] args) {
        DisplayLinkedList list = new DisplayLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the linked list:");
        int n=sc.nextInt();
        
        for (int i=0;i<n;i++) {
        	System.out.print("Enter the number:");
        	int data=sc.nextInt();
        	list.insertAtEnd(data);
        }
        list.displayList();
        list.CountNode();
        System.out.print("Enter a number to insert at the beginning: ");
        int dataAtBeg = sc.nextInt();
        list.insertatbeg(dataAtBeg);
        list.displayList();
        System.out.print("enter the node you want to enter after:");
        int dataafternode=sc.nextInt();
        System.out.print("enter the data you want to enter:");
        int numberafternode=sc.nextInt();
        list.insertafternode(numberafternode,dataafternode);
        list.displayList();
        System.out.print("enter the node you want to enter before:");
        int databeforenode=sc.nextInt();
        System.out.print("enter the data you want to enter:");
        int numberbeforenode=sc.nextInt();
        list.insertbeforenode(numberbeforenode,databeforenode);
        list.displayList();
        list.deleteatbeg();
        list.displayList();
        list.deleteatend();
        list.displayList();
        sc.close();
    }
}
