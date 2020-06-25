package chotu;

public class DPProuductArray {
	public static void main(String[] args) {
		int arr[]= { 10, 3, 5, 6, 2 }; 
		int n=arr.length;
		findProductArr(arr,n);
	}
	
	static void findProductArr(int arr[],int n)
	{
		if(n==1)
		{
			System.out.println("0");
			return;
		}
		int[] prod=new int[n];
		int temp=1;
		for(int i=0;i<n;i++)
		{
			prod[i]=1;
		}
		for(int i=0;i<n;i++)
		{
			prod[i]=temp;
			temp=temp*arr[i];
		}
		temp=1;
		for(int i=n-1;i>=0;i--)
		{
			prod[i]=prod[i]*temp;
			temp=temp*arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(prod[i]+", ");
		}
	}

}
