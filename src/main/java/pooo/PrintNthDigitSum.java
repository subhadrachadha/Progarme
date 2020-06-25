package pooo;

public class PrintNthDigitSum {
	public static void main(String[] args) {
		int n=3;
		int sum=6;
		String res="";
		findNthDigitSum(res,n,sum);
	}

	
	public static void findNthDigitSum(String res,int n,int sum)
	{
		if(n>0 && sum>=0)
		{
			char d='0';
			
			if(res.equals(""))
			{
				d='1';
			}
			
			for(;d<='9';d++)
			{
				findNthDigitSum(res+d,n-1,sum-(d-'0'));
			}
			
		}
		
		else if(n==0 && sum==0)
		{
			System.out.print(res+" ");
		}
	}
}
