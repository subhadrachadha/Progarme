
public class Pyramid {
public static void main(String[] args) {
	int n=5;
	print(5);
}

static void print(int x)
{
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
}
}
