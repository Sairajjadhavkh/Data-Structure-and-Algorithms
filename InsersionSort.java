

//Insersion Sort
import java.util.*;
class InsersionSort{
	public static void main(String args[])
	{
		int temp,j;
		int arr[]={1,2,3,9,4,3,0};
		for(int i=1;i<arr.length;i++){
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}