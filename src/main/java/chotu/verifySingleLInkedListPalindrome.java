package chotu;

import java.util.Stack;

public class verifySingleLInkedListPalindrome {
	
	public static void main(String[] args) {
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(3);
		Node six=new Node(2);
		Node seven=new Node(1);
		boolean isPalin=true;
		one.ptr=two;
		two.ptr=three;
		three.ptr=four;
		four.ptr=five;
		five.ptr=six;
		six.ptr=seven;
		boolean Palin=Palindrome(one,isPalin);
		
		if(Palin)
		{
			System.out.println("data is palindrome");
		}
		else
		{
			System.out.println("data is not palindrome");
		}
		
		
	}
	
	static class Node
	{
		int data;
		Node ptr;
		Node(int d)
		{
			data=d;
			ptr=null;
		}
	}
	static boolean Palindrome(Node head,boolean isPalin)
	{
		Stack<Integer> s=new Stack<Integer>();
		Node slow=head;
		while(slow!=null)
		{
			s.push(slow.data);
			slow=slow.ptr;
		}
		
		while(head!=null)
		{
			int i=s.pop();
			if(head.data==i)
			{
				isPalin=true;
				
			}
			else
			{
				isPalin=false;
				break;
			}
			head=head.ptr;
		}
		
		return isPalin;
		
	}
	

}
