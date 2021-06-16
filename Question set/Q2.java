/*2. How to find the largest and smallest number in an unsorted
array?
*/
class Q2{
	public static void main(String args[])
	{
		int arr[]={2,4,1,8,5,9,3,9,-1};
		int max=arr[0];
		int min=max;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("max: "+max+" min: "+min);
	}
}