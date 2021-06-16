/*
7. How to find common elements in three sorted arrays? */


class Q7{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,6};
		int arr2[]={1,2,3,4,5,6,7,8,9};
		int arr3[]={1,2,3,4,5};
		int up=0;
		int mid=0;
		int small=0;
		if(arr1.length>arr2.length && arr1.length>arr3.length){
			up=arr1.length;
		}
		else if(arr2.length>arr3.length){
			up=arr2.length;
		}
		else{
			up=arr3.length;
		}
		if(arr1.length<arr2.length && arr1.length<arr3.length){
			small=arr1.length;
		}
		else if(arr2.length<arr3.length){
			small=arr2.length;
		}
		else{
			small=arr3.length;
		}
		
		for(int i=0;i<up;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				for(int k=0;k<small;k++)
				{
					if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
					System.out.println(arr1[i]);
				}
			}
		}
	}
}