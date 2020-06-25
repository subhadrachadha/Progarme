package chotu;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[]= {1,5,8};
		int current=1;
		for(int i=0;i<arr.length;i++)
		{
			if(current!=arr[i])
			{
				for(int j=current;j<arr[i];j++)
				{
					System.out.println("missing element"+j);
				}
				
			}
			current=arr[i]+1;
		}
	}

}
