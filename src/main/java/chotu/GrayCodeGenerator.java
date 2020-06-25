package chotu;

import java.util.ArrayList;

public class GrayCodeGenerator {
	
	public static void main(String[] args) {
		generateGrayCode(3);
	}
	
	
	static void generateGrayCode(int n)
	{
		//base case
		if(n<=0)
		{
			return;
		}
		
		ArrayList<String>  arr=new ArrayList<String>();
		arr.add("0");
		arr.add("1");
		
		for(int i=2;i<(1<<n);i=i<<1)
		{
			for(int j=i-1;j>=0;j--)
			{
				arr.add(arr.get(j));
			}
			
			for(int j=0;j<i;j++)
			{
				arr.set(j,'0'+arr.get(j));
			}
			
			for(int j=i;j<2*i;j++)
			{
				arr.set(j,'1'+arr.get(j));
			}
		}
		
		for(int i=0;i<(1<<n);i++)
		{
			System.out.println(arr.get(i));
		}
			
			
			
			
			
		
		
	}

}
