package chotu;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
	  data=d;
	  next=null;
	}
}

class Sort
{
	

	 Node SortedMerge(Node headA,Node headB)
	{
		 /* a dummy first node to  
	       hang the result on */
	    Node dummyNode = new Node(0); 
	      
	    /* tail points to the  
	    last result node */
	    Node tail = dummyNode; 
	    while(true)  
	    { 
	          
	        /* if either list runs out,  
	        use the other list */
	        if(headA == null) 
	        { 
	            tail.next = headB; 
	            break; 
	        } 
	        if(headB == null) 
	        { 
	            tail.next = headA; 
	            break; 
	        } 
	          
	        /* Compare the data of the two 
	        lists whichever lists' data is  
	        smaller, append it into tail and 
	        advance the head to the next Node 
	        */
	        if(headA.data <= headB.data) 
	        { 
	            tail.next = headA; 
	            headA = headA.next; 
	        }  
	        else
	        { 
	            tail.next = headB; 
	            headB = headB.next; 
	        } 
	          
	        /* Advance the tail */
	        tail = tail.next; 
	    } 
	    return dummyNode.next; 
	}
	
}





public class MergeTwoSortedListArray {
	 Node head;
	
	public void addNodeToLast(Node node)
	{
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		
	}
		void printlist()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+",");
				temp=temp.next;
			}
			System.out.println(" ");
		}
	
public static void main(String[] args) {
	MergeTwoSortedListArray list1=new MergeTwoSortedListArray();
	MergeTwoSortedListArray list2=new MergeTwoSortedListArray();
	list1.addNodeToLast(new Node(5));
	list1.addNodeToLast(new Node(10));
	list1.addNodeToLast(new Node(15));
	
	list2.addNodeToLast(new Node(2));
	list2.addNodeToLast(new Node(3));
	list2.addNodeToLast(new Node(20));
	list1.head=new Sort().SortedMerge(list1.head,list2.head);
	
	list1.printlist();
	
}
}
