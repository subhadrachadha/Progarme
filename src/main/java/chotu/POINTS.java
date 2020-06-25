package chotu;

public class POINTS {
	// A Java program to check if four given points form a square or not. 

	

	// Structure of a point in 2D space 
	static class Point 
	{ 
		int x, y; 

			public Point(int x, int y) 
			{ 
				this.x = x; 
				this.y = y; 
			} 
		
	}; 

	// A utility function to find square of distance 
	// from point 'p' to point 'q' 
	static int distSq(Point p, Point q) 
	{ 
		return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y); 
	} 

	// This function returns true if (p1, p2, p3, p4) form a 
	// square, otherwise false 
	static boolean isSquare(Point p1, Point p2, Point p3, Point p4) 
	{ 
		int d2 = distSq(p1, p2); // from p1 to p2 
		int d3 = distSq(p1, p3); // from p1 to p3 
		int d4 = distSq(p1, p4); // from p1 to p4 

		if (d2 == 0 || d3 == 0 || d4 == 0)	 
			return false; 

		// If lengths if (p1, p2) and (p1, p3) are same, then 
		// following conditions must met to form a square. 
		// 1) Square of length of (p1, p4) is same as twice 
		// the square of (p1, p2) 
		// 2) Square of length of (p2, p3) is same 
		// as twice the square of (p2, p4) 

		if (d2 == d3 && 2 * d2 == d4 
			&& 2 * distSq(p2, p4) == distSq(p2, p3)) 
		{ 
			return true; 
		} 

		// The below two cases are similar to above case 
		if (d3 == d4 && 2 * d3 == d2 
			&& 2 * distSq(p3, p2) == distSq(p3, p4)) 
		{ 
			return true; 
		} 
		if (d2 == d4 && 2 * d2 == d3 
			&& 2 * distSq(p2, p3) == distSq(p2, p4)) 
		{ 
			return true; 
		} 

		return false; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		Point p1 = new Point(20, 10), p2 = new Point( 10, 20 ), 
			p3 = new Point(20, 20 ), p4 = new Point( 10, 10 ); 
		System.out.println(isSquare(p1, p2, p3, p4)==true ? "Yes" : "No"); 
	} 
	

	// This code is contributed by PrinciRaj1992 

}
