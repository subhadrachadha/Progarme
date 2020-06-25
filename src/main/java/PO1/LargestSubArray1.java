package PO1;

import java.util.HashMap;

public class LargestSubArray1 {
	public static void main(String[] args) {
		int arr[]= {1,0,0,1,0,1,1};
		System.out.println(maxLen(arr,arr.length));
	}
	
	static int maxLen(int arr[],int n)
	{
		int sum=0;
		int max_len=0;
		int ending_index=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=(arr[i]==0)?-1:1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
		   sum=sum+arr[i];
		   if(sum==0)
		   {
			   max_len=i+1;
			   ending_index=i;
		   }
		   
		   if(map.containsKey(sum+n))
		   {
			   if(max_len<i-map.get(sum+n)) {
				   max_len=i-map.get(sum+n);
				   ending_index=i;
			   }
		   }
		   else
		   {
			   map.put(sum+n,i);
		   }
			
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i]=(arr[i]==-1)?0:1;
		}
		
		return max_len-1;
	}

}
