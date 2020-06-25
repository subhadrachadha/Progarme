import java.util.Arrays;

public class CountNoOfPossibleTraingle {

	public static void main(String[] args) {
		int[] A= {4,3,5,7,6};
		possibleTraingles(A);

	}

	static void possibleTraingles(int A[])
	{
		Arrays.sort(A);
		int count = 0;
		int n=A.length;
		for(int i=n-1;i>=0;i--)
		{
			int l=0,r=i-1;
			
			while(l<r)
			{
				if(A[l]+A[r]>A[i]) {
					count=count+r-l;
					r--;
				}
				else
				{
					l++;
				}
			}
		}
	}
}
