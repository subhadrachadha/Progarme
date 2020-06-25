
public class trianglePyramid {
  public static void main(String[] args) {
	  printTraingle(5);
}
  
  static void printTraingle(int n)
  {
	  for(int i=0;i<n;i++)
	  {
		  for(int j=n-i;j>=0;j--)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println("");
	  }
  }
}
