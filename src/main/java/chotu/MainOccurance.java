package chotu;

public class MainOccurance {
public static void main(String[] args) {
	int arr[] = {1, 2, 2, 4, 4, 4, 4}; 
	int n=arr.length;
	int x=4;
	int count=occurance(arr,x,n);
	System.out.println(x+"Occurs number of items"+count);
}

static int occurance(int arr[],int x,int n)
{
	int i,j;
	i=firstOccurance(arr,0,n-1,x,n);
	if(i==-1)
	{
		return -1;
	}
	j=lastOccurance(arr,i,n-1,x,n);
	return j-i;
	
}

static int firstOccurance(int arr[],int low,int high,int x,int n)
{
	if(high>low)
	{
		int mid=low+(high+low)/2;
		if(mid==0||x>arr[mid-1] && x==arr[mid])
		{
			return mid;
		}
		else if(x>arr[mid])	
		{
			return firstOccurance(arr,mid+1,high,x,n);
		}
		else
		{
			return firstOccurance(arr,low,mid-1,x,n);
		}
		
	}
	return -1;
	
}

static int lastOccurance(int arr[],int low,int high,int x,int n)
{
	if(high>low)
	{
		int mid=(low+high)/2;
		if(mid==n-1|| x<arr[mid+1] && x==arr[mid])
		{
			return mid;
		}
		else if(x<arr[mid])
		{
			return lastOccurance(arr,low,mid-1,x,n);
		}
		else
		{
			return lastOccurance(arr,mid+1,n-1,x,n);
		}
	}
	return -1;
}
}
