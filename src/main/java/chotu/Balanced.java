package chotu;

import java.util.Stack;

public class Balanced {
	public static void main(String[] args) {
		char exp[]= {'{','(',')','}','[',']'};
		if (areBalanced(exp))
		{
			System.out.println("parenthesis is balanced");
		}
		else
		{
			System.out.println("parenthesis is not balanced");
		}
	}
	
	static boolean areBalanced(char[] exp)
	{
		Stack<Character> s=new Stack<Character>();
		for(int i=0;i<exp.length;i++)
		{
			if(exp[i]=='{'|| exp[i]=='(' || exp[i]=='[')
			{
				s.push(exp[i]);
			}
			
			if(exp[i]=='}'|| exp[i]==')'|| exp[i]==']')
			{
				if(s.isEmpty())
				{
					return false;
				}
				else
				{
					if(!isMatching(s.pop(),exp[i]))
					{
						return false;
					}
				}
				
			}
		}
		if(s.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	static boolean isMatching(Character c1,Character c2)
	{
		if(c1=='(' && c2==')')
		{
			return true;
		}
		else if(c1=='{' && c2=='}')
		{
			return true;
		}
		
		else if(c1=='[' && c2==']')
		{
			return true;
		}
		
		return false;
	}

}
