/*List of Program for Lab(Will be discussed tomorrow in Morning Activity)
1)Write a program to perform Array operations like insert or delete element in array, merge 2 array.
2)Write a program to perform Linear and Binary Search
3)Write a program to rotate an array 
Input : 1234567, Output : 3456712
4)Write a program to find the missing number in array
5)WAP to create a stack and perform its various operations
6)WAP to reverse String using stack
7)WAP to convert Infix expression to postfix or prefix expression using stack
8)WAP to balance the brackets using Stack                   */

import java.util.*;
class BalanceBracket{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the expression");
		String exp=sc.nextLine();
		StackOperation obj=new StackOperation(5);
		for(int i=0;i<exp.length();i++){
			if(exp.charAt(i)=='('){
				obj.push('(');
			}
			else if(exp.charAt(i)==')'){
				obj.pop();
			}
		}
		if(obj.isEmpty()){
			System.out.println("Balanced Expression");
		}
		else{
			System.out.println("Un-Balanced Expression");
		}
		
	}
}


class StackOperation{
	int top;
	char arr[];
	int cap;
	StackOperation(int size){
		top=-1;
		arr=new char[size];
		cap=size;
	}
	boolean isFull(){
		return top==cap-1;
	}
	boolean isEmpty(){
		return top==-1;
	}
	void push(char data){
		if(isFull()){
			System.out.println("Stack overflow");
		}
		top++;
		arr[top]=data;
	}
	void pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
		}
		top--;
	}
}











