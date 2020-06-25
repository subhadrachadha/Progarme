package chotu;

public class ReplaceAll0with5 {
public static void main(String[] args) {
	int num=10120;
	System.out.println(replace0with5(num));
}

static int replace0with5(int num)
{
	if(num==0)
	{
		return 5;
	}
	else
	{
		return convert0to5(num);
	}

	
}

static int convert0to5(int num)
{
	
	if(num==0)
	{
		return 0;
	}
	int digit=num%10;
	 if(digit==0)
	{
		digit=5;
		
	}
	 int S=(num/10)*10+digit;
	 return convert0to5(num/10)*10+digit;
	
}
}

