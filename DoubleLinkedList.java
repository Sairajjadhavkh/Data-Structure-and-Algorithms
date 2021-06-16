


class DoubleLinkedList{
	public static void main(String args[])
	{
		LinkedListExample1 obj=new LinkedListExample1();
		obj.insert(34);
		obj.insert(56);
		obj.insert(7);
		obj.insert(69);
		System.out.println("**********************");
		obj.displayF();
		obj.insertAfter(12345,69);
		System.out.println("**********************");
		obj.displayF();
		obj.insertInBigning(12);
		obj.insertInBigning(5);
		System.out.println("**********************");
		obj.displayF();
		obj.delete(12345);
		System.out.println("**********************");
		obj.displayF();
		obj.insertAtPosition(5,100);
		System.out.println("**********************");
		obj.displayF();
		obj.deleteAtPosition(6);
		System.out.println("**********************");
		obj.displayF();
		System.out.println("**********************");
		
	}
}

class Node1{
	int data;
	Node1 next;
	Node1 prev;
	Node1(int data){
		this.data=data;
		next=null;
		prev=null;
	}
}

class LinkedListExample1{
	Node1 head;
	void insert(int data)
	{
		Node1 n=new Node1(data);
		if(head==null){
			head=n;
		}
		else{
			Node1 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
	}
	
	void insertAfter(int data,int key){
		Node1 n=new Node1(data);
		Node1 temp=head;
			while(temp.data!=key &&temp.next!=null){
			temp=temp.next;
		}
		if(temp.next!=null){
			n.next=temp.next;
		n.prev=temp;
		temp.next=n;
		temp.next.prev=n;
		}
		else{
			temp.next=n;
			n.prev=temp;
		}
	}
	void insertInBigning(int data)
	{
		Node1 n=new Node1(data);
		if(head==null)
		{
			head=n;
		}
		n.next=head;
		head.prev=n;
		head=n;	
	}
	void delete(int key){
		Node1 temp=head;
		while(temp.data!=key)
		{
			temp=temp.next;
		}
		if(temp!=head && temp.next!=null){
			temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		}
		else if(temp.next==null){
			temp.prev.next=null;
		}
		else{
			head=temp.next;
			temp.prev=null;
		}
		
	}
	void insertAtPosition(int pos,int data){
		Node1 n =new Node1(data);
		Node1 temp=head;
		if(pos==0){
			n.next=head.next;
			temp.prev=n;
			head=n;
		}else{
			for(int i=0;i<pos;i++){
			temp=temp.next;
		}
		n.next=temp.prev.next;
		n.prev=temp.prev;
		temp.prev.next=n;
		temp.prev=n;
		}
	}
	void deleteAtPosition(int pos){
		Node1 temp=head;
		for(int i=0;i<pos;i++)
		{
			temp=temp.next;
		}
		if(temp!=head && temp.next!=null){
			temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		}
		else if(temp.next==null){
			temp.prev.next=null;
		}
		else{
			head=temp.next;
			temp.prev=null;
		}
		
	}
	
	void displayF(){
		Node1 temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void displayReverse(){
		Node1 temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	
}












