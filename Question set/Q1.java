/* 1. How to find the missing number in an integer array of 1
to 100? */

class Q1{
	public static void main(String args[])
	{
		int arr[]=new int[100];
		int num=123;
		int flag=0;
		int a=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=a++;
			if(arr[i]==num){
				flag=1;
				break;
			}
			else flag=0;
		}
		if(flag==1) System.out.println(num+" found");
		else System.out.println(num+" is missing");
	}
}