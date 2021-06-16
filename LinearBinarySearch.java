// linear and binary search




class LinearBinarySearch{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		int element=4;
		MySearch1 obj=new MySearch1();
		int res1=obj.linearSearch(arr,element);
		if(res1==1)
		System.out.println("found");
		else
		System.out.println("not found ");
	
		obj.binarySearch(arr,element);
	}
}



class MySearch1{
	public int linearSearch(int arr[],int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
			return 1;
			}
		}
		return -1;
	}
	
	public void binarySearch(int arr[],int element)
	{
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(element==arr[mid]){
				System.out.println("element found at index "+mid);
				break;
			}
			else if(element<arr[mid])
			{
				high=mid-1;
			}
			else{
				low=mid+1;
			}
			mid=(low+high)/2;
		}
	}
}















