package PO1;

public class Pair {
	int a ;
	int b;
	Pair(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	static int getMaxLengthPair(Pair pair[],int n)
	{
		int[] ml=new int[n+1];
		int max=0;
		for(int i=0;i<n;i++)
		{
			ml[i]=1;
		}
		
		for(int i=1;i<pair.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if((pair[i].a >pair[j].b) && (ml[i]<ml[j]+1))
				{
				ml[i]=ml[j]+1;
				}
			}
		}
			
			for(int k=0;k<n;k++)
			{
				if(max<ml[k])
				{
					max=ml[k];
				}
			}
			
			
	
		
		return max;
		
	}
	
	public static void main(String[] args) {
		Pair[] pair=new Pair[] {new Pair(5,24),new Pair(15,25),new Pair(27,40),
				new Pair(50,60)};
		System.out.println(getMaxLengthPair(pair,pair.length));
		}
	
	}
