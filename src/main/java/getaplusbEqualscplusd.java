import java.util.HashMap;
import java.util.Map;

public class getaplusbEqualscplusd {
	public static void main(String[] args) {
		int[] arr= {3,4,7,1,2,9,8};
		int n=arr.length;
		findPair(arr);
	}
	
	static void findPair(int arr[])
	{
		Map<Integer,pair> p=new HashMap<Integer,pair>();
		int sum;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(!p.containsKey(sum))
				{
					p.put(sum,new pair(i,j));
				}
				
				else
				{
					pair p1=p.get(sum);
					System.out.println("("+arr[p1.first]+","+arr[p1.second]+")"+" "+"("+arr[i]+
							","+arr[j]+")");
				}
			}
			
		}
	}
	
	

}

class pair
{
	int first;
	int second;
	pair(int first,int second)
	{
		this.first=first;
		this.second=second;
	}
}
