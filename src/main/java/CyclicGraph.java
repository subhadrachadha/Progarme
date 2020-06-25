import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CyclicGraph {
	
	private final int V;
	private final List<List<Integer>> adj;
	
	CyclicGraph(int V)
	{
		this.V=V;
		adj=new ArrayList<>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new LinkedList<>());
		}
		
	}
	
	public void addEdges(int V,int E)
	{
		adj.get(V).add(E);

	}
	
	public boolean isCyclic()
	{
		boolean[] visited=new boolean[V];
		boolean[]  recStack=new boolean[V];
		for(int i=0;i<V;i++)
		{
			if(isCyclicUtil(i,visited,recStack))
			{
				return true;
			}
		}
		return false;
		
		
	}
	
	public boolean isCyclicUtil(int i,boolean[] visited,boolean[] recStack)
	{
		if(recStack[i])
		{
			return true;
		}
		
		if(visited[i])
		{
			return true;
		}
		
		visited[i]=true;
		recStack[i]=true;
		List<Integer> child=adj.get(i);
		for(int c:child)
		{
			if (isCyclicUtil(c,visited,recStack))
			{
				return true;
				
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		CyclicGraph graph=new CyclicGraph(4);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(1, 2);
		graph.addEdges(2, 0);
		graph.addEdges(2, 3);
		graph.addEdges(3, 3);
		
		if(graph.isCyclic())
		{
			System.out.println("Cycle is present in graph");
		}
				
		else
		{
			
		}
				
				
		
			
		
		
	}

}
