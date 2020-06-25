
public class StringOccuranceRunLength {
public static void main(String[] args) {
	String str="aabbccef";
	StringOccuranceRunLength strob=new StringOccuranceRunLength();
	int n=str.length();
	System.out.println(n);
	strob.getStringOccurance(str);
}

static void getStringOccurance(String str)
{
	StringBuilder sb=new StringBuilder();
	int count=1;
	for(int i=1;i<str.length()-1;i++)
	{
		if(str.charAt(i)==str.charAt(i-1))
		{
			count++;
		}
		else
		{
		sb.append(count);
		sb.append(str.charAt(i-1));
		count=1;
		}
	}
	
	if(str.length()>0)
	{
		if(str.charAt(str.length()-1)==str.charAt(str.length()-2))
		{
			count++;
			
		}
		else
		{
		sb.append(count);
		sb.append(str.charAt(str.length()-2));
		count=1;
		}
		sb.append(count);
		sb.append(str.charAt(str.length()-1));
	}
	System.out.println(sb.toString());
}
}
