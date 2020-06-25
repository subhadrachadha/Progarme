package chotu;

import java.util.Stack;

public class Queue {
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer>  s2=new Stack<Integer>();
	
	static void enQueue(int x)
	{
		while(!s1.isEmpty())
		{
			s2.add(s1.pop());
		}
			
		s1.push(x);
		
		while(!s2.isEmpty())
		{
			s1.add(s2.pop());
		}
		
	}
	
	static int deQueue()
	{
		if(s1.isEmpty())
		{
			System.out.println("Stack is undeflow");
		}
		else
		{
			int x=s1.peek();
			s1.pop();
			return x;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}
