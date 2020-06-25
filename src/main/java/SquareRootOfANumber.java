
public class SquareRootOfANumber {
	public static void main(String[] args) {
		int x=11;
		System.out.println(findFloor(x));
	}

	
	static int findFloor(int x)
	{
		int res = 0;
		if(x==0|| x==1)
		{
			return x;
		}
		int start=1,end=x;
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(mid*mid==x)
			{
				return x;
			}
			
			if(mid*mid<x)
			{
				start=mid+1;
				res=mid;
			}
			else
			{
				end=mid-1;
			}
		}
		
		return res;
	}
}
