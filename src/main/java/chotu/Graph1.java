package chotu;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph1 {
    public static int V;
	private static LinkedList<Integer> adj[];
	
	Graph1(int V)
	{
		this.V=V;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
		
		
	}
	
	public void addEdge(int v,int w)
	{
		adj[v].add(w);
		System.out.println();
	}
	
	static void BFS(int s)
	{
		boolean[] visited =new boolean[V];
		
		visited[s]=true;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.add(s);
		while(queue.size()>0)
		{
			int s1=queue.poll();
			System.out.println(s1+" ");
			Iterator<Integer> it=adj[s1].iterator();
			while(it.hasNext())
			{
				int s2=it.next();
				if(!visited[s2])
				{
					visited[s2]=true;
					queue.add(s2);
				}
			}
		}
		
	
	}
	
	public static void main(String[] args) {
		Graph1 g=new Graph1(4);
		g.addEdge(0, 2);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.BFS(2);
	}

}
