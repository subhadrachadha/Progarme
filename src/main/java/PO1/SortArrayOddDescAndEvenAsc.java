package PO1;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayOddDescAndEvenAsc {
	public static void main(String[] args) {
		Integer arr[]= {1,3,2,7,5,4};
		int n=arr.length;
		twoWay(arr,n);
		
	}

	static void twoWay(Integer arr[],int n)
	{
		int l=0;
		int r=n-1;
		int k = 0;
		while(l<r)
		{
			while(arr[l]%2!=0)
			{
				l++;
				k++;
			}
			
			while(arr[r]%2==0)
			{
				r--;
			}
			if(l<r)
			{
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
			}
		}
		
		
		Arrays.sort(arr,0,k,Collections.reverseOrder());
		Arrays.sort(arr,k,n);
		System.out.println(Arrays.toString(arr));
	}
}
