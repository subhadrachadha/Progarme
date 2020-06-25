import java.util.HashMap;
import java.util.Map;

public class getPair {
	public static void main(String[] args) {
		int arr1[]= {1,0,-4,7,6,4};
		int arr2[]= {0,2,4,-3,2,1};
		int n=arr1.length;
		int m=arr2.length;
		int x=8;
		findPairs(arr1,n,arr2,m,x);	
		}
	
	static void findPairs(int arr1[],int n,int arr2[],int m,int x)
	{
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			hm.put(arr1[i],0);
		}
		
		for(int i=0;i<m;i++)
		{
			if(hm.containsKey(x-arr2[i]))
			{
				System.out.println(x-arr2[i]+"---combination--"+arr2[i]);
			}
		}
	}

}
