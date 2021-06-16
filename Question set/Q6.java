
/*6. How to find kth largest element in an unsorted array?*/


import java.util.*;

class Q6{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,4,3,6,4,9};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("enter kth largest element to find");
		int a=sc.nextInt();
		System.out.println(arr[(a-1)]);
	}
}