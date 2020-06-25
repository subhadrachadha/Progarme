package practice.Program.Program;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
	
	public static void main(String[] args) {
		int[] arr= {1,9,3,10,4,20,2};
		findLongest(arr,arr.length);
	}

	
	static void findLongest(int arr[],int n)
	{
		Set<Integer> s=new HashSet<Integer>();
		int ans=0;
		for(int i=0;i<n;i++)
		{
			s.add(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(!s.contains(arr[i]-1))
			{
				int j=arr[i];
				while(s.contains(j))
				{
					j++;
				}
				
				if(ans<j-arr[i])
				{
					ans=j-arr[i];
				}
				
			}
		}
		System.out.println(ans);
	}
}
