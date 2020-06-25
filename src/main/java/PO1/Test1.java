package PO1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(10);
		l.add(15);
		List<Integer> l2=new ArrayList<Integer>();
	    l2=l.stream().filter(I->I%2==0).collect(Collectors.toList());
	    System.out.println(l2);
		
	    l2=l.stream().map(I1->I1*2).collect(Collectors.toList());
	    System.out.println(l2);
	}

}
