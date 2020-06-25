import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import chotu.Main;

class Node
{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
		
	}
}


public class BinaryTreeTopView {
	Node root;
	BinaryTreeTopView()
	{
		root=null;
	}
	
	private void TopViewTree(Node root)
	{
		
	class QueueObj
	{
		int hd;
		Node node;
		
		public QueueObj(Node node,int hd)
		{
			this.hd=hd;
			this.node=node;
		}
	 }
	   Queue<QueueObj> q=new LinkedList<QueueObj>();
	   Map<Integer,Node> treeTopView=new TreeMap<Integer,Node>();
	   
	
	   if(root==null)
	   {
		   return;
	   }
	   else
	   {
		   q.add(new QueueObj(root,0));
		   
	   }
	   while(!q.isEmpty())
	   {
		 QueueObj tempNode=q.poll();
		 if(!treeTopView.containsKey(tempNode.hd))
		 {
			 treeTopView.put(tempNode.hd,tempNode.node);
		 }
		 
		 if(tempNode.node.left!=null)
		 {
			 q.add(new QueueObj(tempNode.node.left,tempNode.hd-1));
		 }
		  if(tempNode.node.right!=null)
		 {
			 q.add(new QueueObj(tempNode.node.right,tempNode.hd+1));
		 }
	   }
	   
	   
	   for(Map.Entry<Integer,Node> e: treeTopView.entrySet())
	   {
		   System.out.print(e.getValue().data+" ");
	   }
	
	}
	
	
	public static void main(String[] args) {
		BinaryTreeTopView tree=new BinaryTreeTopView();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.left.right.right=new Node(5);
		tree.root.left.right.right.right=new Node(6);
		tree.TopViewTree(tree.root);
		
	}
}
