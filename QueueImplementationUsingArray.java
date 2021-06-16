





class QueueImplementationUsingArray{
	public static void main(String args[])
	{
		MyQueue obj=new MyQueue(5);
		obj.enqueue(23);
		obj.enqueue(3);
		obj.enqueue(54);
		obj.enqueue(85);
		obj.enqueue(74);
		System.out.println(obj.isFull());
		obj.dqueue();
		obj.dqueue();
		obj.display();
	}
}



class MyQueue{
	int arr[];
	int head;
	int tail;
	int n;
	int cap;
	MyQueue(int size)
	{
	cap=size;
	arr=new int[size];
	head=0;
	tail=-1;
	n=0;
	}
	
	public boolean isEmpty(){
		return tail==-1;
	}
	
	public boolean isFull(){
		return tail==cap-1;
	}
	
	public void enqueue(int element){
		if(isFull()){
		System.out.println("queue is full");
		}
		n++;
		tail++;
		arr[tail]=element;
	}
	public void dqueue(){
		if(isEmpty()){
		System.out.println("queue is empty");
		}
		n--;
		System.out.println("dqued element is "+arr[head++]);
	}
	public void peek(){
		System.out.println(arr[tail]);
	}
	void display(){
		System.out.println("displaying elements is queue");
		for(int i=head;i<=tail;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}