package Poo;

public class SortArrayInWave {
	public static void main(String[] args) {
		int arr[]= {10,90,49,2,1,5,23};
		int n=arr.length;
		for(int i=0;i<arr.length;i=i+2)
		{
			if(i>0 && arr[i-1]>arr[i])
			{
				swap(arr,i-1,i);
			}
			
			if(i<n-1 && arr[i]<arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+",");
		}
		
		
	}
	
	static void swap(int arr[],int i,int j)
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
