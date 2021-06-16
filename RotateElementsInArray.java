

// rotate emements


class RotateElementsInArray{
	static void rotateArray(int arr[],int size,int d)
	{
		for(int j=0;j<d;j++)
		{
			int temp=arr[0];
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[size-1]=temp;
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println();
	}
}

	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7};
		int size=arr.length;
		rotateArray(arr,size,2);
		
		
	}
}