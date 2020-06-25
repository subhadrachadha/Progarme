import java.util.Arrays;

public class CountElementsLessOrEqualToArr2 {
public static void main(String[] args) {
	int[] arr1= {1,2,3,4,7,9};
	int[] arr2= {0,1,2,1,1,9};
	int m=arr1.length;
	int n=arr2.length;
	getCountLessOrEqualToArr2(arr1,m,arr2,n);
}

static void getCountLessOrEqualToArr2(int arr1[],int m,int arr2[],int n)
{
	for(int i=0;i<arr1.length;i++)
	{
		int count=getIndexFromBS(arr2,0,n-1,arr1[i]);
		System.out.println("Count of elements less then or equal to"+count);
	}
}

static int getIndexFromBS(int[] arr2,int low,int high,int x)
{
	Arrays.sort(arr2);
	int l,h = 0;
	while(low<=high)
	{
		int mid=(low+high)/2;
		
		if(arr2[mid]<=x)
		{
			low=mid+1;
		}
		else
		{
			 high=mid-1;
		}
		
			
		
	}
	return high;
	
}
}
