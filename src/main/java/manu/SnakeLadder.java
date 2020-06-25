package manu;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadder {
	public static void main(String[] args) {
		int N=30;
		int[] move=new int[N];
		for(int i=0;i<N;i++)
		{
			move[i]=-1;
		}
		
		//ladder
        move[2]=21;
        move[4]=7;
        move[19]=28;
        move[10]=25;
        
        
        //snake
        move[26]=0;
        move[20]=8;
        move[16]=3; 	
        move[18]=6;
        System.out.print(getMinimumDice(move,N));
}
	static int getMinimumDice(int[] move,int N)
	{
	Queue<qentry> q=new LinkedList<>();
	qentry qe=new qentry();
	qe.v=0;
	qe.dist=0;
	int[] visited=new int[N];
	visited[0]=1;
	while(!q.isEmpty())
	{
		qentry q2=new qentry();
		q2=q.remove();
		int v=q2.v;
		for(int j=v+1;j<=(v+6)&& j<N;++j)
		{
			if(visited[j]==0)
			{
				 qentry e=new qentry();
				 e.dist=(qe.dist+1);
				 visited[j]=1;
				 
				 if(move[j]!=1)
				 {
					 e.v=move[j]; 	
				 }
				 else
				 {
					 e.v=j;
				 }
				 q.add(e);
			}
		}			
			
	}
	return qe.dist;
		
	}
	
	static class qentry
	{
		int v;
		int dist;
	}
}
