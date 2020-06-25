package secronix;

public class Permutation1 {
	public static void main(String[] args) {
		String str="ABC";
		int n=str.length();
		int l=0,r=n-1;
		findData(str,l,r);
	}

	static void findData(String str,int l,int r)
	{
		if(l==r)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				findData(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	
	static String swap(String str,int i,int j)
	{
		char temp = 0;
		char[] charArray=str.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
	    charArray[j]=temp;
	    return String.valueOf(charArray);
	    
	}
}
