package chotu;

public class GetMinimiumInSortedAndRotatedArray {
	public static void main(String[] args) {
		int arr[]= {5,6,1,2,3,4};
		int n=arr.length;
		System.out.println(findMinimum(arr,0,n-1));
		

		int arr9[] = {3, 4, 5, 2}; 
		int n9 = arr9.length; 
		System.out.println("The minimum element is "+ findMinimum(arr9, 0, n9-1)); 
	}

	
	static int findMinimum(int arr[],int low,int high)
	{
		//check for mid element is greater
		if(high<low)
		{
			return arr[0];
		}
		
		if(high==low)
		{
			return arr[0];
		}
        
		int mid=low+(high-low)/2;
		//check if mid element is lower
		if(mid>low && arr[mid]<arr[mid-1])
		{
			return arr[mid];
		}
		
		//check for mid+1 element is lower
		
		if(mid<high && arr[mid+1]<arr[mid])
		{
			return arr[mid+1];
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
