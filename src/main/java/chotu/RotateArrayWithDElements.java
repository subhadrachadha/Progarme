package chotu;

public class RotateArrayWithDElements {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int d=2;
		rotateArrayWithD(arr,d);
	}

	
	static void rotateArrayWithD(int arr[],int d)
	{
		int n=arr.length;
		int g_c_d=gcd(n,d);
		int k=0;
		for(int i=0;i<g_c_d;i++)
		{
			int temp=arr[i];
			int j=0;
			while(true)
			{
				k=j+d;
				if(k>=n)
				{
					k=k-n;
				}
				if(k==i)
				{
					break;
				}
				arr[j]=arr[k];
				j=k;
				
				
			}
			arr[j]=temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
	static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
		
	}
}
