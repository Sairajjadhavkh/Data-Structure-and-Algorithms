/*Given two lists sorted in increasing order, create and return a new list
representing the intersection of the two lists. The new list should be made with
its own memory — the original lists should not be changed.
Example:
Input:
First linked list: 1->2->3->4->6
Second linked list be 2->4->6->8,
Output: 2->4->6.
The elements 2, 4, 6 are common in
both the list so they appear in the
intersection list.Input:
First linked list: 1->2->3->4->5
Second linked list be 2->3->4,
Output: 2->3->4
The elements 2, 3, 4 are common in
both the list so they appear in the
intersection list.
*/
import java.util.*;
class Q2{
	public static void main(String args[])
	{
		LinkedList2 obj=new LinkedList2();
		obj.intersection();
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class LinkedList2{
	Node head1;
	Node head2;
	Scanner sc=new Scanner(System.in);
	void creat1(){
		System.out.println("creating 1st linked list");
		System.out.println("enter no of nodes");
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
			System.out.println("Element "+(i+1)+":");
			Node n=new Node(sc.nextInt());
			Node temp=head1;
			if(head1==null){
				head1=n;
			}
			else{
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=n;
			}
		}
	}
	void creat2(){
		System.out.println("creating 2nd linked list");
		System.out.println("enter no of nodes");
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
			System.out.println("Element "+(i+1)+":");
			Node n=new Node(sc.nextInt());
			Node temp=head2;
			if(head2==null){
				head2=n;
			}
			else{
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=n;
			}
		}
	}
	void intersection(){
		creat1();
		creat2();
		Node temp1=head1;
		Node temp2=head2;
		while(temp1!=null){
			temp2=head2;
			while(temp2!=null){
				if(temp1.data==temp2.data){
					System.out.print(temp1.data+"->");
				}
				temp2=temp2.next;
			}
			temp1=temp1.next;
		}
	}
}











