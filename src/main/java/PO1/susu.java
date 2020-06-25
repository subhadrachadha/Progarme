package PO1;

public class susu {
	public static void main(String[] args) {
	String data = new String("Miral");
	String data1 = "Miral";
	String data2 = "Miral";
	System.out.println(data == data1);
	System.out.println(data1 == data2);
	System.out.println("-----------------------");
	String string = "Miral";
	String string2 = "Modi";
	String string3 = string + string2;
	String string4 = "MiralModi";

	System.out.println(string3 == string + string2);
	System.out.println("-----------------------");

	String s1 = "Buggy";
	String s2 = "Bread";

	String s3 = "BuggyBread";

	String s4 = "Buggy" + "Bread";
	String s5 = s1 + s2;
	System.out.println(s3 == s4); // True
	System.out.println(s3 == s5);
	
	}
}
