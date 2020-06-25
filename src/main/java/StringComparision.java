
public class StringComparision {
	
	    public static void main(String[] args)
	    {
	        
	       String s1 = "aabbccef";
	        //Trim all the spaces of the string using replaceAll method
	       String s2 = s1.replaceAll("\\s","");
	       StringComparision str=new StringComparision();
	        str.Compression(s2);
	    }


	    //Create a Java Method Compression to compress the string
	    public static String Compression(String s)
	    {
	        int count = 1;
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 1; i < s.length()-1 ; i++)
	        {
	            if (s.charAt(i) == s.charAt(i - 1))
	            {
	                count++;
	            }
	            else
	            {
	                sb.append(count);
	                sb.append(s.charAt(i - 1));
	                count = 1;
	            }
	        }
	//Count the last character of the string
	        if (s.length() > 1)
	        {
	            //Compare the last two characters of the string
	            if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2))
	            {
	                count++;
	            }
	            else
	            {
	                sb.append(count);
	                sb.append(s.charAt(s.length() - 2));
	                count = 1;
	            }
	            sb.append(count);
	            sb.append(s.charAt(s.length() - 1));

	        }
	        s = sb.toString();
	        System.out.println("The compressed string along with the counts of repeated characters is:" + "\n" +s);
	        return s;
	    }
}
