package chotu;

import java.util.Stack;

public class GetSmallerElementOnLeftUsingStack {
	public static void main(String[] args) {
		int arr[] = {1, 3, 0, 2, 5}; 
		int n = arr.length; 
		printPrevSmaller(arr, n); 
	}
	
	static void printPrevSmaller(int arr[],int n)
	{
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
			while(!s.isEmpty() && s.peek()>=arr[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				System.out.print("");
			}
			else
			{
				System.out.print(s.peek()+" ");
			}
			s.push(arr[i]);
		}
	}

}
