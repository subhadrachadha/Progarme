import java.util.Arrays;

public class Sliding {
	static final int MAX_CHAR=256;
	public static void main(String[] args) {
		String str="aabcbcdbca";
		int n=str.length();
		System.out.println(findSubString(str,n));
	}
	
	static String findSubString(String str,int n)
	{
		//distinct character_count
		int dist_count=0;
		boolean[] visited=new boolean[MAX_CHAR];
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++)
		{
			if(visited[str.charAt(i)]==false)
			{
				visited[str.charAt(i)]=true;
				dist_count++;
			}
		}
		
		int start=0,start_index=-1;
		int min_len=Integer.MAX_VALUE;
		int count=0;
		int[] curr_count=new int[MAX_CHAR];
		for(int i=0;i<n;i++)
		{
			curr_count[str.charAt(i)]++;
			
			
			if(curr_count[str.charAt(i)]==1)
			{
				count++;
			}
			
			if(count==dist_count)
			{
				while(curr_count[str.charAt(start)]>1)
				{
					if(curr_count[str.charAt(start)]>1)
					{
						curr_count[str.charAt(start)]--;
					}
					start++;
				}
				
				int len=i-start+1;
				if(min_len>len)
				{
					min_len=len;
					start_index=start;
				}
				
			}
		}
		
		return str.substring(start_index,start_index+min_len);
		
		
		
	}

}
