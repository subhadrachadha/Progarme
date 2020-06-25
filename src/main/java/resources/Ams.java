package resources;

public class Ams {
	public static void main(String[] args) {
		int originalNumber=1634;
		int n=0;
		int result=0;
		int reminder;
		for(;originalNumber!=0;originalNumber/=10,++n);
		
		int number=originalNumber;
		for(;originalNumber!=0;originalNumber/=10)
		{
			reminder=originalNumber%10;
			result=(int) (result+Math.pow(reminder, n));
			
		}
		if(result==originalNumber)
		{
			System.out.println("original number is amstrong number");
		}
		else
		{
			System.out.println("original number is not amstrong number");
		}
		
	}

}
