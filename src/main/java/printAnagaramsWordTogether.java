import java.util.ArrayList;
import java.util.HashMap;

public class printAnagaramsWordTogether {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("cat");
		list.add("dog");
		list.add("odg");
		list.add("god");
		list.add("tac");
		System.out.println(solver(list));
	}

	private static ArrayList<ArrayList<String>> solver(ArrayList<String> list)
	{
		HashMap<HashMap<Character,Integer>,ArrayList<String>> map1=
				new HashMap<HashMap<Character,Integer>,ArrayList<String>>();
		
		
		for(String str:list)
		{
			HashMap<Character,Integer> tempMap=new HashMap<Character,Integer>();
			for(int i=0;i<str.length();i++)
			{
				if(tempMap.containsKey(str.charAt(i)))
				{
					int x=tempMap.get(str.charAt(i));
					tempMap.put(str.charAt(i),++x);
				}
				else
				{
					tempMap.put(str.charAt(i),1);
				}
			}
			
			if(map1.containsKey(tempMap))
			{
				map1.get(tempMap).add(str);
			}
			else
			{
				
				ArrayList<String> templist=new ArrayList<String>();
				templist.add(str);
				map1.put(tempMap, templist);
			}
		}
		
		
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		
		for(HashMap<Character,Integer> res:map1.keySet())
		{
			result.add(map1.get(res));
		}
		
		return result;
	}
}
