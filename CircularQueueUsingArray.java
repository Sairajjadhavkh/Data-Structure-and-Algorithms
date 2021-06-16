


class CircularQueueUsingArray{
	public static void main(String args[])
	{
		MyQueue1 obj=new MyQueue1(5);
		obj.enqueue(23);
		obj.enqueue(54);
		obj.enqueue(78);
		obj.enqueue(85);
		obj.enqueue(32);
		obj.enqueue(32);
		
		
		obj.display();
	}
}


class MyQueue1{
	int arr[];
	int head;
	int tail;
	int cap;
	MyQueue1(int size){
	arr=new int[size];
	tail=0;
	head=0;
	cap=size;
	}
	public boolean isEmpty(){
		return tail==-1;
	}
	public boolean isFull(){
		return tail==head;
	}
	
	public void enqueue(int element)
	{	
		if(isFull()){
			System.out.println("overflow");
		}
		arr[tail]=element;
		tail=(tail+1)%cap;
	}
	public void dqueue(){
		if(isEmpty()){
			System.out.println("underflow");
		}
		System.out.println(arr[head]);
		head=(head+1)%cap;
	}
	void display(){
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
}





