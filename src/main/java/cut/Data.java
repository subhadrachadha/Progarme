package cut;

import java.util.Stack;

public class Data {
	public static void main(String[] args) {
		int[] arr= {10,-1,4,2,20,30};
		int top=0;
		int element;
		int minele = 0;
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			s.push(arr[i]);
			top++;
			
		}
		while(top>0)
		{
			if(s.size()>1)
			{
			element=s.pop();
			
			if(!s.isEmpty())
			{
				if(element>s.peek())
				{
					minele=s.peek();
				}
				else
				{
					s.pop();
					s.push(element);
				}
			}
			}
			else
			{
				
			}
			top--;
		}
		
		System.out.println(minele);
	}

}
