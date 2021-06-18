

import java.util.*;
class ReverseSingleLinkList{
	public static void main(String args[])
	{
		SingleLinkedList obj=new SingleLinkedList();
		obj.create();
		obj.reverse();
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

class SingleLinkedList{
	Scanner sc=new Scanner(System.in);
	Node head;
	void create(){
		System.out.println("enter no of nodes");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			Node n=new Node(sc.nextInt());
			if(head==null){
				head=n;
			}else{
				Node temp=head;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=n;
			}
		}
	}
	void reverse(){
		Node p=head;
		Node q=head;
		head=head.next;
		q=head;
		p.next=null;
		while(head!=null){
			head=head.next;
			q.next=p;
			p=q;
			q=head;
		}
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
}





