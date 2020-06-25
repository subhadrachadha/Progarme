package chotu;

public class ReplaceEveryElementWithMaxFromRight {
	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		int n=arr.length;
		ReplaceForNextGreatest(arr,n);
		printArray(arr);
	}
  static void ReplaceForNextGreatest(int arr[],int n)
  {
	  int max_so_far=arr[n-1];
	  
	  //Next greatest from right is always -1
	  arr[n-1]=-1;
	  
	  for(int i=n-2;i>=0;i--)
	  {
		  int temp=arr[i];
		  arr[i]=max_so_far;
		  
		  if(max_so_far<temp)
		  {
			  max_so_far=temp;
		  }
		  
	  }
	  
  }
  
  static void printArray(int[] arr)
  {
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+",");
	  }
  }
}
