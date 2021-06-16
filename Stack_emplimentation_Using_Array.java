

class Stack_emplimentation_Using_Array{
	public static void main(String args[])
	{
		 MyStack obj=new  MyStack(5);
		 obj.push(3);
		 obj.push(0);
		 obj.push(4);
		 obj.push(23);
		 obj.pop();
		 obj.pop();
		 obj.pop();
		 obj.peek();
	}
}


class MyStack{
	int arr[];
	int top;
	int cap;
	public MyStack(int size){
		arr=new int[size];
		top=-1;
		cap=size;
	}
	
	boolean isFull(){
		return top==(cap-1);
	}
	
	boolean isEmpty(){
	return top==-1;
	}	
	
	void push(int element)
	{
		if(isFull()){
			System.out.println("Stack overflow");
		}
		top++;
		arr[top]=element;
	}
	void pop()
	{
		if(isEmpty()){
			System.out.println("Stack underflow");
		}
		System.out.println(arr[top--]);
	}
	int peek(){
		System.out.println(arr[top]);
		return arr[top];
	}
}


