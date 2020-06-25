package chotu;

public class verfiyPositionOfRightMostShiftBit {
	public static void main(String[] args) {
		int n=16;
		findRightSetBitPOsition(n);
	}
	
	static void findRightSetBitPOsition(int n)
	{
		int m=1;
		int position=1;
		while((n&m)==0)
		{
			m=m<<1;
			position++;
		}
		System.out.println(position);
	}

}
