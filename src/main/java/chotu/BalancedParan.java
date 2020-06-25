package chotu;

import java.util.Stack;

public class BalancedParan {
public static void main(String[] args) {
	char exp[] = {'{','(',')','}','[',']'}; 
	if(isBalanced(exp))
	{
		System.out.println("Expression is balanced");
	}
	else
	{
		System.out.println("Expression is not balanced");
	}
}

static boolean isBalanced(char exp[])
{
	
	Stack<Character> s=new Stack<Character>();
	
	for(int i=0;i<exp.length;i++)
	{
		if(exp[i]=='(' || exp[i]=='{' || exp[i]=='[')
		{
			s.push(exp[i]);
		}
		else if(exp[i]==')'|| exp[i]=='}' || exp[i]==']')
		{
			if(!isMatching(s.pop(),exp[i]))
			{
				return true;
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

static boolean isMatching(char c1,char c2)
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
