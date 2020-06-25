package chotu;

public class NextGreaterElement {
	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3 }; 
		int n = arr.length; 
		printNextGreaterElement(arr,n);
	}

	
	static void printNextGreaterElement(int arr[],int n)
	{
		stack s=new stack();
		s.push(arr[0]);
		int next,element;
		for(int i=1;i<n;i++)
		{
			next=arr[i];
			if(s.isEmpty()==false)
			{
				element=s.pop();
				
				while(element<next)
				{
					System.out.println(element+"next greater element ->"+next);
					if(s.isEmpty()==true)
					{
						break;
					}
					element=s.pop();
				}
				
				if(element>next)
				{
					s.push(element);
				}
				
			}
			s.push(next);
		}
		
		while(s.isEmpty()==false)
		{
			int element1=s.pop();
			System.out.println(element1+"->"+-1);
		}
	}
	
	static class stack{
		static int top=-1;
		static int[] items=new int[100];
		static void push(int x)
		{
			if(top==99)
			{
				System.out.println("stack is underflow");
			}
			else
			{
				items[++top]=x;
				
			}
		}
		
		static int pop()
		{
			if(top==-1)
			{
				System.out.println("stack is underflow");
			}
			else
			{
				int element=items[top];
				top--;
				return element;
				
			}
			return top;
		}

	
	static boolean isEmpty()
	{
		return (top ==-1)? true:false;
	}
	}
}
