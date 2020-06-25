
public class printStringInZigZag {
	public static void main(String[] args) {
		String str="kaamvjjfl";
		int n=str.length();
		printZigZag(str,4);
	}

	
	static void printZigZag(String str,int k)
	{
		
		
		for(int i=0;i<str.length();i=i+(k-1)*2)
		{
			System.out.print(str.charAt(i));
		}
		
		for(int i=1;i<k-1;i++)
		{
			boolean down=true;
			
			for(int j=i;j<str.length();)
			{
				System.out.print(str.charAt(j));
				if(down)
				{
					j=j+(k-i-1)*2;
				}
				else
				{
					j=j+(k-1)*2-(k-i-1)*2;
					
				}
				down=!down;
				
			}
		}
		
		for(int i=k-1;i<str.length();i=i+(k-1)*2)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
	}
}
