package chotu;

import java.util.HashMap;

public class LargestSubArray {
	public static void main(String[] args) {
		int[] arr= {15,-2,2,-8,1,7,10,23};
		int n=arr.length;
		System.out.println(getLength(arr));
	}
	
	static int getLength(int arr[])
	{
		int sum=0;
		int max_len=1;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0 || sum==0)
			{
				max_len=max_len+1;
			}
			
			if(sum==0)
			{
				max_len=max_len+1;
			}
			sum=sum+arr[i];
			
			
			Integer prev_i=hm.get(sum);
			if(prev_i !=null)
			{
				max_len=Math.max(max_len,i-prev_i);
			}
			else
			{
				hm.put(sum,i);
			}
			
		}
		
		return max_len;
	}

}
