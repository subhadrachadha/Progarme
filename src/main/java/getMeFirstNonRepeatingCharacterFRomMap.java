import java.util.HashMap;
import java.util.Map;

class CountIndex
{
	int count;
	int index;
	public CountIndex(int index)
	{
		this.count=1;
		this.index=index;
	}

	public int InCount()
	{
		this.count++;
		return count;
		
	}
	
}


public class getMeFirstNonRepeatingCharacterFRomMap {
	static int NO_OF_CHARS=256;
	static Map<Character,CountIndex> hm=new HashMap<Character,CountIndex>(NO_OF_CHARS);
	
	static void getCharArrayCount(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.get(str.charAt(i)).InCount();
			}
			else
			{
				hm.put(str.charAt(i), new CountIndex(i));
			}
		}
	}
	static int FirstNonRepeatingChar(String str)
	{
		getCharArrayCount(str);
		int result=Integer.MAX_VALUE;
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.get(str.charAt(i)).count==1 && result>hm.get(str.charAt(i)).index)
			{
				result=hm.get(str.charAt(i)).index;
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		String str="geeksforgeeks";
		int index=FirstNonRepeatingChar(str);
		System.out.println((index==Integer.MAX_VALUE)?"Every elements is repeating":
			"First non repeating element"+str.charAt(index));
	}

}
