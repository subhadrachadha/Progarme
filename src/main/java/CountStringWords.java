import java.util.HashMap;
import java.util.Map;

public class CountStringWords {
public static void main(String[] args) {
	String s[] = { "hate", "love", "peace", "love", 
            "peace", "hate", "love", "peace", 
            "love", "peace" }; 
int n = s.length; 
System.out.println(n);
 countWords(s, n); 
}

static void countWords(String[] s,int n)
{
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	
	for(int i=0;i<s.length-1;i++)
	{
		if(hm.containsKey(s[i]))
		{
			hm.put(s[i],hm.get(s[i])+1);
		}
		else
		{
			hm.put(s[i], 1);
		}
	}
	
	for(Map.Entry<String,Integer> it:hm.entrySet())
	{
		if(it.getValue()==2)
		{
			System.out.print(it.getKey()+"*****"+it.getValue());
		}
	}
	
}
}
