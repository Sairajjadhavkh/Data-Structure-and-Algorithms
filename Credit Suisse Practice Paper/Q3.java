/*Given a singly linked list and a key, count the number of occurrences of given
key in linked list. For example, if the given linked list is 1->2->1->2->1->3->1
and the given key is 1, then output should be 4.
*/
import java.util.*;
class Q3{
	public static void main(String args[])
	{
		LinkedList3 obj=new LinkedList3();
		obj.displaycount(1);
		
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

class LinkedList3{
	Scanner sc=new Scanner(System.in);
	Node head;
	void creat1(){
		System.out.println("creating 1st linked list");
		System.out.println("enter no of nodes");
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
			System.out.println("Element "+(i+1)+":");
			Node n=new Node(sc.nextInt());
			Node temp=head;
			if(head==null){
				head=n;
			}
			else{
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=n;
			}
		}
	}
	void displaycount(int data){
		int count=0;
	  creat1();
	  Node temp1=head;
	 while(temp1!=null){
		 if(temp1.data==data){
			 count++;
		 }
		 temp1=temp1.next;
	 }
	  System.out.println("count: "+count);
	}
}




