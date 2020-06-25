package practice.Program.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubSequence {
	static int LCSubStr(char X[], char Y[], int m, int n)  
    { 
        // Create a table to store lengths of longest common suffixes of 
        // substrings. Note that LCSuff[i][j] contains length of longest 
        // common suffix of X[0..i-1] and Y[0..j-1]. The first row and 
        // first column entries have no logical meaning, they are used only 
        // for simplicity of program 
        int LCStuff[][] = new int[m + 1][n + 1]; 
        int result = 0;  // To store length of the longest common substring 
        
        
        
          
        // Following steps build LCSuff[m+1][n+1] in bottom up fashion 
        for (int i = 1; i <= m; i++)  
        { 
            for (int j = 1; j <= n; j++)  
            { 
                if (i == 0 || j == 0) 
                    LCStuff[i][j] = 0; 
                else if (X[i - 1] == Y[j - 1]) 
                { 
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1; 
                    result = Integer.max(result, LCStuff[i][j]); 
                    
                  
                    
                }  
                
                else
                {
                    LCStuff[i][j] = 0; 
                }
                
            } 
        } 
       
        return result; 
    } 
      
	public static void main(String[] args)  
    { 
        String X = "OldSite"; 
        String Y = "NewSite"; 
  
        int m = X.length(); 
        int n = Y.length(); 
  
        System.out.println("Length of Longest Common Substring is "
                + LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
    } 
}
