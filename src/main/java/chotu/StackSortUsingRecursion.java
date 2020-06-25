package chotu;

import java.util.ListIterator;
import java.util.Stack;

public class StackSortUsingRecursion {
	
static void printStack(Stack<Integer> st)
{
	ListIterator<Integer> it=st.listIterator();
	while(it.hasNext())
	{
		it.next();
	}
	while(it.hasPrevious())
	{
		System.out.print(it.previous()+",");
	}
	
		
}

public void sortedStack(Stack<Integer> s,int x)
{
	if(s.isEmpty()|| x>s.peek())
	{
		s.push(x);
		return;
	}
	int temp=s.pop();
	sortedStack(s,x);
	s.push(temp);
	
}

public void sortStack(Stack<Integer> s)
{
	if(!s.isEmpty())
	{
		int x=s.pop();
		sortStack(s);
		sortedStack(s,x);
	}
}
public static void main(String[] args) {
	StackSortUsingRecursion ss=new StackSortUsingRecursion();
	Stack<Integer> st=new Stack<Integer>();
	st.push(-3);
	st.push(14);
	st.push(18);
	st.push(-5);
	st.push(30);
	ss.printStack(st);
	ss.sortStack(st);
}
}
