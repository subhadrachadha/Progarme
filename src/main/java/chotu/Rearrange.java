package chotu;

import java.util.Comparator;
import java.util.PriorityQueue;
class Key1Comparator implements Comparator<Key1>
{

	@Override
	public int compare(Key1 k1, Key1 k2) {
		if(k1.freq>k2.freq)
		{
			return -1;
		}
		else if(k1.freq<k2.freq)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	
	
}

class Key1
{
	int freq;
	char ch;
	Key1(int freq,char ch)
	{
		this.freq=freq;
		this.ch=ch;
	}
}

public class Rearrange {
	
	static void rearrangeStr(String str,int n)
	{
		int MAX_CHAR=26;
		int count[] =new int[MAX_CHAR];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		
		PriorityQueue<Key1> pq=new PriorityQueue<Key1>(new Key1Comparator());
		for(char c='a';c<='z';c++)
		{
			int value=c-'a';
			if(count[value]>0)
			{
				pq.add(new Key1(count[value],c));
			}
			
		}
		 String str1="";
		 Key1 prev=new Key1(-1,'#');
		 while(pq.size()!=0)
		 {
			 Key1 c=pq.peek();
			 pq.poll();
			 str1=str1+c.ch;
			 if(prev.freq>0)
			 {
				 pq.add(prev);
			 }
			 
			 c.freq--;
			 prev=c;
		 }
		 System.out.print(str1);
	}
		
	

public static void main(String[] args) {
	String str="bbbaa";
	int n=str.length();
	rearrangeStr(str,n);
	
}

}
