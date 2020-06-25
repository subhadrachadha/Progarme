package poo;

public class MinimumElementInRotatedArray {
	
	public static void main(String[] args) {
		int[] arr= {5,6,2,3};
		int low=0;
		int high=arr.length-1;
		System.out.println(findMinimum(arr,low,high));
		
		
	}
	
	static int findMinimum(int arr[],int low,int high)
	{
		if(high<low)
		{
			return arr[0];
		}
		
		if(high==low)
		{
			return arr[low];
		}
		int mid=low+(high-low)/2;
		
		if(mid<high && arr[mid+1]<arr[mid])
		{
			return arr[mid+1];
		}
		
		
		if(mid>low && arr[mid]<arr[mid-1])
		{
			return arr[mid];
		}
		
		if(arr[high]>arr[mid])
		{
			return findMinimum(arr,low,mid-1);
		}
		else
		{
			return findMinimum(arr,mid+1,high);
		}
		
	}

}
