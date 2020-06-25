package practice.Program.Program;

public class CountNoStringsStartAndEndWith1 {
	public static void main(String[] args) {
		String str="00100101";
		int m=0;
		
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='1')
			{
				m++;
			}
		}
		int x=m*(m-1)/2;
		System.out.println(x);
	}

}
