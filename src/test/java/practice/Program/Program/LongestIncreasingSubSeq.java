package practice.Program.Program;

public class LongestIncreasingSubSeq {
	public static void main(String[] args) {
		int arr[] = {1,12,7,0,23};
		findLongestIncreasing(arr);
	}
	
	
	static void findLongestIncreasing(int arr[])
	{
		int[] LIS=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int max=-1;
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					if(max==-1 || max<LIS[j]+1)
					{
						max=LIS[j]+1;
					}
				}
			}
			
			if(max==-1)
			{
				max=1;
			}
			LIS[i]=max;
		}
		
		
		int result=-1;
		int index=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(result<LIS[i])
			{
				result=LIS[i];
				index=i;
			}
		}
		String path="";
		path=arr[index]+"";
		int res=result-1;
		for(int i=index-1;i>=0;i--)
		{
			if(LIS[i]==res)
			{
				path=arr[i]+" "+path;
				res--;
			}
			
		}
		System.out.print(path);
		
	}

}
