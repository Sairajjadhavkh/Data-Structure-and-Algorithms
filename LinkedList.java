

import java.util.*;

class LinkedList{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedListExample obj=new LinkedListExample();
		for(int i=0;i<5;i++)
		{
			int a=sc.nextInt();
			obj.insertB(a);
		}
		obj.display();
	}

}


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
		
	}
}

class LinkedListExample{
	Node head;
	void insertB(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
		}
		else{
			n.next=head;
			head=n;
		}
	}
	void insertLast(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
			temp=temp.next;
			}
			temp.next=n;
		}
	}
	void insertinM(int data,int key){
		Node n=new Node(data);
		Node temp=head;
		while(temp.data!=key)
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}
	void deleteFirst(){
		head=head.next;
	}
	void deleteLast(){
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
	}
	void deleteInM(int key){
		Node temp=head;
		Node temp1=head;
		if(key==0){
			head=head.next;
		}
		else{
			for(int i=0;i<key;i++)
		{
			temp1=temp;
			temp=temp.next;
		}
		temp1.next=temp.next;	
		}
		
		
	}
	void display(){
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
