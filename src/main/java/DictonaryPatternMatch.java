import java.util.HashMap;

public class DictonaryPatternMatch {
	public static void main(String[] args) {
		String[] dict= {"abb","acc","abd","ash"};
		String pattern="foo";
		dictonaryComp(dict,pattern);
	}
	
	static void dictonaryComp(String[] dict,String pattern)
	{
		int len=pattern.length();
		String hash=enCoding(pattern);
		for(String word:dict)
		{
			if(len==word.length()&&enCoding(word).equals(hash))
			{
				System.out.println(word+",");
			}
		}
		
	}

	
	static String enCoding(String encode)
	{
		HashMap<Character,Integer> en=new HashMap<Character,Integer>();
		int len=encode.length();
		int i=0;
		String res="";
		for(int j=0;j<encode.length();j++)
		{
			if(!en.containsKey(encode.charAt(j)))
			{
				en.put(encode.charAt(j),i++);
			}
			res=res+en.get(encode.charAt(j));
		}
		return res;
	}
}
