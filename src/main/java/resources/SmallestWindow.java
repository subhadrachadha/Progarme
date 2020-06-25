package resources;

public class SmallestWindow {
	public static void main(String[] args) {
		String str="this is a test string";
		String part="tist";
		System.out.print(finalString(str,part));
	
}
	
	static String finalString(String str,String part)
	{
		int length1=str.length();
		int length2=part.length();
		final int no_of_chars=256;
		
		
		if(length1<length2)
		{
			return "";
		}
		int[] hash_str=new int[no_of_chars];
		int[] hash_pat=new int[no_of_chars];
		int count=0;
		int start=0,start_index=0,min_len=Integer.MAX_VALUE;
		
		//check the occurance of pattern
		
		for(int i=0;i<part.length();i++)
		{
			hash_pat[part.charAt(i)]++;
		}
		
		for(int j=0;j<str.length();j++)
		{
			hash_str[str.charAt(j)]++;
			
			if(hash_pat[str.charAt(j)]!=0
					&& hash_str[str.charAt(j)]<=hash_pat[str.charAt(j)])
				    count++;
				
				if(count==length2)
				{
					while(hash_str[str.charAt(start)]>hash_pat[str.charAt(start)] ||
							hash_pat[str.charAt(start)]==0)
					{
						if(hash_str[str.charAt(start)]>hash_pat[str.charAt(start)])
						{
							start++;
						}
						
					}
					
					int length_of_window=j-start+1;
					if(min_len>length_of_window)
					{
						min_len=length_of_window;
						start_index=start;
					}
				}
			}
			
		
		return str.substring(start_index, start_index+min_len);
		
	}
	}
