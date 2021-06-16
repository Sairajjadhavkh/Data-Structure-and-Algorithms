


class HomeWork1{
	static int findIndex(int arr[],int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element){
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String args[])
	{
		int arr[]={10,20,30,80,60,50,110,130,170};
		int res=findIndex(arr,175);
		
		if(res==-1){
			System.out.println("x is not present in arr[]");
		}
		else{
			System.out.println("x found at index "+res);
		}
		
	}
}