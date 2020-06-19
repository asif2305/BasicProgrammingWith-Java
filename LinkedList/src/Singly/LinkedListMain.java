package Singly;

public class LinkedListMain {

	public static void main(String[] args) {
		// Start with empty list
		SinglyLinkedList myLinkedList=new SinglyLinkedList();
		
		myLinkedList.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		 /* Three nodes have been allocated dynamically. 
        We have references to these three blocks as head,   
        second and third 

        llist.head        second              third 
           |                |                  | 
           |                |                  | 
       +----+------+     +----+------+     +----+------+ 
       | 1  | null |     | 2  | null |     |  3 | null | 
       +----+------+     +----+------+     +----+------+ */
		
		myLinkedList.head.next=second;
		second.next = third; // Link second node with the third node 
		  
	        /*  Now next of the second Node refers to third.  So all three 
	            nodes are linked. 
	  
	         llist.head        second              third 
	            |                |                  | 
	            |                |                  | 
	        +----+------+     +----+------+     +----+------+ 
	        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
	        +----+------+     +----+------+     +----+------+ */
		
		myLinkedList.pushElementBefore(7);
		myLinkedList.addElementAtTheEnd(10);
		
		//myLinkedList.printList();

	}



}
