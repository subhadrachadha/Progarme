package chotu;

import java.util.HashSet;

public class VerifyPairSetProduct {
public static void main(String[] args) {
	int arr[] = {10, 20, 9, 40}; 
    int x = 200; 
    int n = arr.length; 
    
    if(isPairExist(arr,x))
    {
    	System.out.println("Yes");
    }
    else
    {
    	System.out.println("No");
    }
}

static boolean isPairExist(int arr[],int x)
{
	HashSet<Integer> s=new HashSet<Integer>();
	if(arr.length<2)
	{
		return false;
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
		{
			if(x==0)
			{
				return false;
			}
		}
		
		else if(x%arr[i]==0)
		{
			if(s.contains(x/arr[i]))
			{
				return true;
			}
			s.add(arr[i]);
		}
	}
	
	return false;
	
}
}
