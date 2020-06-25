
public class reverselinkedlistpairwise {
static Node head;
static class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}

static  void push(int new_data)
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
	
}

 void printList(Node head)
{
	 Node temp=head;
	 while(temp!=null)
	 {
		 System.out.print(temp.data+",");
		 temp=temp.next;
	 }
	 
	 System.out.println("");
	 
	
}
 
 static Node reverseList(Node head,int k)
 {
	 Node current=head;
	 Node prev=null;
	 Node next=null;
	 int count=0;
	 while(count<k && current!=null)
	 {
		 next=current.next;
		 current.next=prev;
		 prev=current;
		 current=next;
		 count++;
	 }
	 if(next!=null)
	 {
		 head.next=reverseList(next,k);
	 }
	 return prev;
 }

public static void main(String[] args) {
	reverselinkedlistpairwise list=new reverselinkedlistpairwise();
	push(5);
	push(4);
	push(3);
	push(2);
	push(1);
	list.printList(list.head);
	list.head=reverseList(list.head,2);
	list.printList(list.head);
	/* Traverse only till there are atleast 2 nodes left */
   /* while (temp != null && temp.next != null) { 

         Swap the data 
        int k = temp.data; 
        temp.data = temp.next.data; 
        temp.next.data = k; 
        temp = temp.next.next; 
    } */
}
}
