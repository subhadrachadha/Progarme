package chotu;

public class printStringPatternWithSpaces {
	public static void main(String[] args) {
		String str="ABCD";
		int n=str.length();
		printPattern(str,n);
		
	}
	
	static void printPattern(String str,int n)
	{
		int len=n;
		char[] buf=new char[2*len+1];
		
		buf[0]=str.charAt(0);
		printPatternUtil(str,buf,1,1,len);
	}
	
	static void printPatternUtil(String str,char[] buf,int i,int j,int n)
	{
		if(i==n)
		{
			buf[j]='\0';
			System.out.println(buf);
			return;
		}
		
		buf[j]=str.charAt(i);
		printPatternUtil(str,buf,i+1,j+1,n);
		
		buf[j]=' ';
		buf[j+1]=str.charAt(i);
		printPatternUtil(str,buf,i+1,j+2,n);
		
	}

}
