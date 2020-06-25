package cut;
import java.util.HashSet;
import java.util.Set;

public class GETPALINDROME {
	public static void main(String[] args) {
		String str="abacaba";
		int n=str.length();
		findPalinDrome(str,n);
	}
	
	static void findPalinDrome(String str,int n)
	{
		Set<String> s=new HashSet<String>();
		for(int i=0;i<str.length();i++)
		{
			//even length palindromic string
			expand(str,i,i,s);
			
			//odd length palindromic string
			expand(str,i,i+1,s);
		}
	}
	
	
  static void expand(String s,int low,int high,Set<String> s1)
  {
	  while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high))
	  {
		  s1.add(s.substring(low, high+1));
		  System.out.println(s1);
		  low--;
		  high++;
	  }
	  
  }
}
