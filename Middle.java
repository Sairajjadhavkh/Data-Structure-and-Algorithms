








class InsertElementInBetween{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int arr1[]=new int[arr.length-1]; 
		int index=2;
		for(int i=index;i<arr.length-1;i++){ 
			arr[i]=arr[i+1];	
		}
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i];
		}
		
		for(int a:arr1){
			System.out.println(a);
		}
	}
}

