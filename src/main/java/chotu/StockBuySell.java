package chotu;

import java.util.ArrayList;

class Interval
{
	int buy;
	int sell;
}


public class StockBuySell {
	public static void main(String[] args) {
		StockBuySell stock = new StockBuySell(); 
		  
        // stock prices on consecutive days 
        int price[] = { 100, 180, 260, 310, 40, 535, 695 }; 
        int n = price.length; 
  
        // fucntion call 
        stock.stockBuySell(price, n); 
	}
	
	static void stockBuySell(int price[] ,int n)
	{
		ArrayList<Interval> e=new ArrayList<Interval>();
		int i=0;
		int count=0;
		while(i<n-1)
		{
			while((i<n-1)&& (price[i+1]<=price[i]))
			{
				i++;
			}
			Interval b=new Interval();
			b.buy=i++;
			
			if(i==n)
			{
				break;
			}
			
			while(price[i]>price[i-1])
			{
				i++;
				
			}
			
			b.sell=i-1;
			e.add(b);
			count++;
		}
		
		if(count==0)
		{
			System.out.println();
		}
		else
		{
			for(int j=0;j<count;j++)
			{
				System.out.println(e.get(j).buy);
				System.out.println(e.get(j).sell);
			}
		}
	}

}
