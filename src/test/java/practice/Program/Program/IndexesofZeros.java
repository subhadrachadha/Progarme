package practice.Program.Program;

public class IndexesofZeros {
	public static void main(String[] args) {
		int arr[]= {1,0,0,1,1,0,1,0,1,1};
		int n=arr.length;
		findZeroFlip(arr,n);
	}

	
	static void findZeroFlip(int arr[],int n)
	{
		int wl=0,wr=0;
		int bestwindow=0,bestl=0;
		int zeroCount=0;
		int m=2;
		while(wr<arr.length)
		{
			if(zeroCount<=m)
			{
				if(arr[wr]==0)
				{
					zeroCount++;
				}
				wr++;
			}
			
			if(zeroCount>m)
			{
				if(arr[wl]==0)
				{
					zeroCount--;
				}
				wl++;
			}
			
			if((wr-wl>bestwindow) && (zeroCount<=m))
			{
				bestwindow=wr-wl;
				bestl=wl;
				
			}
		}
		
		for(int i=0;i<bestwindow;i++)
		{
			if(arr[bestl+i]==0)
			{
				System.out.print(bestl+i+" ");
			}
		}
	}
}
