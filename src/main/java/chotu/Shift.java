package chotu;

public class Shift {
	// Java program to find the 
	// first rightmost set bit 
	// using XOR operator 


		// function to find 
		// the rightmost set bit 
		static int PositionRightmostSetbit(int n) 
		{ 
			// Position variable initialize 
			// with 1 m variable is used to 
			// check the set bit 
			int position = 1; 
			int m = 1; 

			while ((n & m) == 0) { 

				// left shift 
				m = m << 1; 
				position++; 
			} 
			return position; 
		} 

		// Driver Code 
		public static void main(String[] args) 
		{ 
			int n = 16; 

			// function call 
			System.out.println(PositionRightmostSetbit(n)); 
		} 
	 

	// This code is contributed 
	// by Smitha 

}
