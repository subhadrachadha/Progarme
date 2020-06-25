package chotu;

import java.util.Arrays;

public class NextGreateNumberWithSameSetOfDigits {
	public static void main(String[] args) {
		char digits[]= {'5','3','4','9','7','6'};
		int n=digits.length;
		findNext(digits,n);
	}

	
	static void findNext(char arr[],int n)
	{
		int i;
		for(i=n-1;i>0;i--)
		{
			if(arr[i]>arr[i-1])
			{
				
				break;
				
			}
		}
		
		if(i==0)
		{
			System.out.println("there is no minimum numbers present in right side");
		}
		else
		{
			int min;
			int x=arr[i-1];
			min=i;
		
		
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]>x && arr[j]<arr[min])
			{
				min=j;
			}
		}
		
		swap(arr,i-1,min);
		
		Arrays.sort(arr,i,n);
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
			
		}
		
		
	}
 
	
	
	static void swap(char arr[],int i,int j)
	{
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
