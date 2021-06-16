
/*2. Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
INITIAL array :
1 2 3 4 5 6 7 8 9 10
After splitting :
Array 1 : 1 2 3 4
5
Array 2 : 6 7 8 9 10
*/

class Q2
{
	public static void main(String args[])
	{
		int arr[]={1 ,2, 3, 4, 5, 6 ,7 ,8, 9, 10};
		int arr1[]=new int[arr.length/2];
		int arr2[]=new int[arr.length/2];
		int x=0,y=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i<(arr.length/2))
			arr1[x++]=arr[i];
			else
			arr2[y++]=arr[i];
		}
		System.out.print("Array 1: ");
		for(int x1:arr1){
		System.out.print(x1+" ");
		}
		System.out.println();
		System.out.print("Array 2: ");
		for(int y1:arr2){
		System.out.print(y1+" ");
		}
	}
}