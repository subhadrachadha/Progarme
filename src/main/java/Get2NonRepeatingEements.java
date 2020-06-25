
public class Get2NonRepeatingEements {
	public static void main(String[] args) {
		Get2NonRepeatingEements t=new Get2NonRepeatingEements();
		int [] arrA = {4,5,4,5,3,2,9,3,9,8};
	    t.find(arrA);
	}
	
	static void find(int arr[])
	{
		int xor=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			xor=xor^arr[i];
		}
		
		int right_most_bit=xor & ~(xor-1);
		int a=0,b=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			if((x & right_most_bit)!=0)
			{
				a=a^x;
			}
			else
			{
				b=b^x;
			}
		}
		
	}
}
