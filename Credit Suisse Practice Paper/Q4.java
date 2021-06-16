

/*Given a linked list, check if the linked list has a loop or not. Below diagram
shows a linked list with a loop.
*/
import java.util.*;
class Q4{
	public static void main(String args[])
	{
		LinkedList3 obj=new LinkedList3();
		obj.checkLoop();
		
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
	void checkLoop(){
		creat1();
		Node temp1=head;
		Node temp2=head;
		While(temp1.next!=null){
			temp2=temp1;
			temp1=temp1.next;
		}
		if(temp1.next==temp2)
		System.out.println("looped");
	}
}


