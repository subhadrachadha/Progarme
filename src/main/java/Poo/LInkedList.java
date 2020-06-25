package Poo;

public class LInkedList {
	static Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	static void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ,");
			temp=temp.next;
		}
	}
	
	public void deleteKey(int key)
	{
		Node temp=head;
		Node prev=temp;
		while(temp!=null && temp.data==key)
		{
			head=head.next;
			temp=head;
		}
		while(temp!=null)
		{
			while(temp!=null && temp.data!=key)
			{
				prev=temp;
				temp=temp.next;
			}
			
			if(temp==null)
			{
				return;
			}
			prev.next=temp.next;
			temp=prev;
		}
		
	}
	public static void main(String[] args) {
		LInkedList list=new LInkedList();
		list.push(7);
		list.push(2);
		list.push(3);
		list.push(2);
		list.push(8);
		list.push(1);
		list.push(1);
		list.push(2);
		list.push(2);
		
		list.printList();
		System.out.println("\n");
		
		int key=2;
		list.deleteKey(key);
		
		list.printList();
		
	}

}
