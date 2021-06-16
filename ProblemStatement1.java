
// find the missing number in n natural number in array


class ProblemStatement1{
	static void missingElement(int arr[]){
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<=arr.length+1;i++){
			sum1=sum1+i;
		}
		for(int i=0;i<arr.length;i++){
			sum2=sum2+arr[i];
		}
		
		System.out.println(sum1-sum2);
	}

	public static void main(String args[])
	{
		int arr[]={1,2,3,5};
		missingElement(arr);
	}
}

