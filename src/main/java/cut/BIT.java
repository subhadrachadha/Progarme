package cut;

import java.util.ArrayList;
import java.util.Iterator;

public class BIT {
	public static void main(String[] args) { 
      int array[] = {10, 9, 8, 6, 5, 4}; 
      ArrayList list = new ArrayList(); 
      ArrayList longestList = new ArrayList(); 
      int currentMax; 
      int highestCount = 0; 
      for(int i = 0; i < array.length;i++) 
      { 
          currentMax = Integer.MIN_VALUE; 
          for(int j = i;j < array.length; j++) 
          { 
              if(array[j] > currentMax) 
              { 
                  list.add(array[j]); 
                  currentMax = array[j]; 
              } 
          } 
            
          //Compare previous highest subsequence  
          if(highestCount < list.size()) 
          { 
              highestCount = list.size(); 
              longestList = new ArrayList(list);   
          }    
          list.clear(); 
      }  
      System.out.println(); 
        
      //Print list 
      Iterator itr = longestList.iterator(); 
      System.out.println("The Longest subsequence"); 
      while(itr.hasNext()) 
      { 
          System.out.print(itr.next() + " "); 
      } 
      System.out.println(); 
      System.out.println("Length of LIS: " + highestCount); 
  } 
    
}
