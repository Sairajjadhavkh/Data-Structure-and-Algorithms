/*4. Write a program to find the intersection of two sorted arrays
in Java?
*/

class Q4{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,6,7,8};
		int arr2[]={3,4};
		System.out.print("intersection : [ ");
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println("]");
	}
}