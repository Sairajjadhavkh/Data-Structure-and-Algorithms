/*3. How to find repeated numbers in an array if it contains
multiple duplicates?
*/


class Q3{
	public static void main(String args[])
	{
		int arr[]={1,1,2,3,4,5,9};
		int a=0,b=0;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
	//	System.out.println(temp+" is repeated "+a+" times");
	//	System.out.println(flag+"is repeated"+b+"times");
	}
}