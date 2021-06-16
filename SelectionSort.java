

class SelectionSort{
	public static void main(String args[])
	{
		int arr[]={1,4,2,8,5,7};
		Sort1 obj=new Sort1();
		obj.selectionSort(arr);
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i!=arr.length-1)
			System.out.print(",");
		}
		System.out.print("]");
	}
}

class Sort1{
	void selectionSort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			int num=arr[i];
			for(int j=i+1;j<arr.length;j++){
				if(num>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
	}
}






