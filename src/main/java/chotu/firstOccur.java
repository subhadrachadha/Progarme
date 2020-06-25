package chotu;

import java.util.HashSet;

public class firstOccur {
	public static void main(String[] args) {
		int[] arr= {12,1,12,3,12,1,1,2,3,2,2,3,8};
		int n=arr.length;
		System.out.println(getFirstOccurance(arr,n));
	}
	
	static int getFirstOccurance(int arr[],int n)
	{
		HashSet<Integer> sum_set=new HashSet<Integer>();
		int sum=0;
		int sumset=0;
		for(int i:arr)
		{
			sum_set.add(arr[i]);
		}
		
		for(int d:arr)
		{
			sum=sum+d;
		}
		
		for( int data : sum_set)
		{
			sumset=sumset+data;
			
		}
		
		return ((3*sumset-sum)/2);
	}

}
