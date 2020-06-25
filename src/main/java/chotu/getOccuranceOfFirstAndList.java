package chotu;

public class getOccuranceOfFirstAndList {
	public static void main(String[] args) {
		int start=5,end=40;
		System.out.println(getFirstAndLastOccurance(start,end));
	}
	
	static int getFirstAndLastOccurance(int start,int end)
	{
		return getFirstFrom1(end)-getFirstFrom1(start-1);
	}
	
	static int getFirstFrom1(int x)
	{
		if(x<=10)
		{
			return x;
		}
		
		int tens=x/10;
		int res=tens+9;
		
		int firstDigit=getDigit(x);
		int lastDigit=x%10;
		if(lastDigit<firstDigit)
		{
			res--;
		}
		return res;
		
	}
	
	static int getDigit(int x)
	{
		if(x>=10)
			
		{
			return x/10;
		}
		return 0;
		
	}

}
