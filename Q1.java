


class Q1{

	public static void main(String args[])
	{
		Queue obj=new Queue(5);
		
	}
}

class Queue{
	int arr[];
	int rare;
	int front;
	int cap;
	public Queue(int size){
		arr=new int[size];
		rare=-1;
		front=0;
		cap=size;
	}
	
	boolean isFull(){
		return rare==cap-1;
	}
	boolean isEmpty(){
		return rare==-1;
	}
	
	public void enqueue(int element)
	{
		if(isFull())
		{
			System.out.println("overflow");
		}
		rare=rare+1;
		arr[rare]=element;
	}
	public void dqueue()
	{
		if(isEmpty())
		{
			System.out.println("underflow");
		}
		System.out.println(arr[front++]);
	}
	void display(){
		for(int i=front;i<=rare;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}








