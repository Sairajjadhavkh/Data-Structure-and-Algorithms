/*Question:
Given a Linked List of integers, write a function to modify the linked list such
that all even numbers appear before all the odd numbers in the modified linked
list. Also, keep the order of even and odd numbers the same.
Examples:
Input: 17->15->8->12->10->5->4->1->7->6->NULL
Output: 8->12->10->4->6->17->15->5->1->7->NULL
Input: 8->12->10->5->4->1->6->NULL
Output: 8->12->10->4->6->5->1->NULL
// If all numbers are even then do not change the list
Input: 8->12->10->NULL
Output: 8->12->10->NULL
// If all numbers are odd then do not change the list
Input: 1->3->5->7->NULL
Output: 1->3->5->7->NULL
*/

class Q1{
	public static void main(String args[])
	{
		LinkedList1 obj=new LinkedList1();
		obj.insert(8);
		obj.insert(12);
		obj.insert(10);
		
		obj.modify();
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class LinkedList1{
	Node head;
	void insert(int data){
		Node n=new Node(data);
		Node temp=head;
		if(head==null){
		head=n;
		}
		else{
			while(temp.next!=null)
			{
			temp=temp.next;
			}
			temp.next=n;
		}
	}
	void modify(){
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
			if(temp.data%2==0){
				System.out.print(temp.data+"->");
			}
		}
		temp=head;
		while(temp.next!=null){
			temp=temp.next;
			if(temp.data%2==1){
				System.out.print(temp.data+"->");
			}
		}
		System.out.println("NULL");
	}
}


