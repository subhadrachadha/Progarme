package resources;

import java.util.Arrays;

public class FindSumFour {
	public static void main(String[] args) {
		int[] A= {1,4,45,6,10,12};
		int n=A.length;
		int X=21;
		findSumFour(A,n,X);
	}

	static void findSumFour(int A[],int n,int X)
	{
		Arrays.sort(A);
		for(int i=0;i<n-3;i++)
		{
			for(int j=i+1;j<n-2;j++)
			{
				int l=j+1;
				int r=n-1;
				while(l<r)
				{
					if(A[i]+A[j]+A[l]+A[r]==X)
					{
						System.out.println(A[i]+" "+A[j]+" "+A[l]+" "+A[r]);
						l++;
						r--;
					}
					else if(A[i]+A[j]+A[l]+A[r]<X)
					{
						l++;
					}
					else
					{
						r--;
					}
				}
			}
		}
	}
}
