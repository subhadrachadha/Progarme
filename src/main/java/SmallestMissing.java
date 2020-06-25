
public class SmallestMissing {
public static void main(String[] args) {
	int[] arr= { 0, 10, 2, -10, -20 }; 
	int n=arr.length;
	System.out.println(findMissing(arr,n));
}

static int findMissing(int arr[],int n)
{
	int shift=segregate(arr,n);
	int[] arr2=new int[n-shift];
	int j=0;
	for(int i=shift;i<n;i++)
	{
		arr2[j]=arr[i];
		j++;
	}
	return findMissingEle(arr2,j);
}

static int segregate(int arr[],int n)
{
	int j=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<=0)
		{
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
			j++;
			
		}
		
	}
	return j;
}

static int findMissingEle(int arr[],int size)
{
	for(int i=0;i<arr.length;i++)
	{
		int x=Math.abs(arr[i]);
		if(x-1<size && arr[x-1]>=0)
		{
			arr[x-1]=-arr[x-1];
		}
		
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			return i+1;
		}
	}
	return 0;
}
}
