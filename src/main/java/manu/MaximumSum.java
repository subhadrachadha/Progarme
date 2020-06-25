package manu;

public class MaximumSum {
	public static void main(String[] args) {
		int[] arr1= {2,3,7,10,12,15,30,34};
		int[] arr2= {1,5,7,8,10,15,16,19};
		int n1=arr1.length;
		int n2=arr2.length;
		System.out.println(findMaximumPath(arr1,n1,arr2,n2));
	}

	static int findMaximumPath(int[] arr1,int n1,int[] arr2,int n2)
	{
		int sum1=0,sum2=0;
		int i=0;
		int j=0;
		int result=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				sum1=sum1+arr1[i++];
			}
			
			else if(arr1[i]>arr2[j])
			{
				sum2=sum2+arr2[j++];
			}
			
			else
			{
				result=result+Math.max(sum1, sum2);
				sum1=0;
				sum2=0;
				
				while(i<n1 && j<n2 && arr1[i]==arr2[j])
				{
					result=result+arr1[i++];
					j++;
				}
			}
		}
		
		while(i<n1)
		{
			sum1=sum1+arr1[i++];
		}
		
		while(j<n2)
		{
			sum2=sum2+arr2[j++];
		}
		
		result=result+Math.max(sum1,sum2);
		return result;
	}
}
