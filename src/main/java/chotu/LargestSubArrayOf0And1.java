package chotu;

import java.util.HashMap;

public class LargestSubArrayOf0And1 {
	public static void main(String[] args) {
		int[] arr= {1,0,0,1,0,1,1};
		int n=arr.length;
		System.out.println(findLargestArray(arr,n));
	}
	
	static int findLargestArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			arr[i]=(arr[i]==0)?-1:1;
		}
		
		int sum=0;
		int max_len=0;
		int start_index=0;
		int end_index=0;
		int end=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
			if(sum==0)
			{
				max_len=i+1;
				end_index=i;
			}
			
			if(hm.containsKey(sum+n))
			{
				if(max_len<i-hm.get(sum+n))
				{
					max_len=i-hm.get(sum+n);
					end_index=i;
				}
				
			}
			else
			{
				hm.put(sum+n,i);
			}
		}
		
		System.out.println("max length"+end+"---------"+(end_index));
		return max_len;
	}

}
