package poo;
import java.io.*; 

public class GFG {
	// java implementation of the approach 

	
	
	static int MAX = 8; 

	static boolean prime[] = new boolean[MAX + 1]; 

	static void SieveOfEratosthenes() 
	{ 
		// Create a boolean array "prime[0..n]" and initialize 
		// all the entries as true. A value in prime[i] will 
		// finally be false if 'i' is Not a prime, else true. 

		//memset(prime, true, sizeof(prime)); 
		for(int i=0;i<MAX+1;i++) 
		prime[i] =true; 

		// 1 is not prime 
		prime[1] = false; 

		for (int p = 2; p * p <= MAX; p++) { 

			// If prime[p] is not changed, then it is a prime 
			if (prime[p] == true) { 

				// Update all multiples of p 
				for (int i = p * 2; i <= MAX; i += p) 
					prime[i] = false; 
			} 
		} 
	} 

	static int findDiff(int arr[], int n) 
	{ 
		// initial min max value 
		int min = MAX + 2, max = -1; 
		for (int i = 0; i < n; i++) { 

			// check if the number is prime or not 
			if (prime[arr[i]] == true) { 

				// set the max and min values 
				if (arr[i] > max) 
					max = arr[i]; 
				if (arr[i] < min) 
					min = arr[i]; 
			} 
		} 

		return (max == -1)? -1 : (max - min); 
	} 

	// Driver code 

		public static void main (String[] args) { 
			// create the sieve 
		SieveOfEratosthenes(); 
		int n = 4; 
		int arr[] = { 1, 2, 3, 5 }; 

		int res = findDiff(arr, n); 

		if (res == -1) 
			System.out.print( "No prime numbers") ; 
		else
			System.out.println( "Difference is " + res); 
		} 
	 

	// This code is contributed by inder_verma.. 

}


