
public class MaximumOccurance {
	public static void main(String[] args) {
		int arr[] = {2, 3, 3, 5, 3, 4, 1, 7}; 
		int n = arr.length; 
		int k=8; 
		System.out.println("Maximum occurance"+findMaximum(arr,n,k));
	}
	
	static int findMaximum(int arr[],int n,int k)
	{
		for(int i=0;i<n;i++)
		{
			arr[arr[i]%k]=arr[arr[i]%k]+k;
		}
		
		int max=arr[0],result=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				result=i;
			}
		}
		
		return result;
	}

}
