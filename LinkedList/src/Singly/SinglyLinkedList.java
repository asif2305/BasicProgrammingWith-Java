package Singly;
// https://java2blog.com/implement-singly-linked-list-in-java/
public class SinglyLinkedList {
   Node head;
   
   // Inserts a new node at front of the list
   public void pushElementBefore(int dataElements)
   {
	   /* 1 & 2: Allocate the Node & 
       Put in the data*/
	   
	   Node newNode=new Node(dataElements);
   System.out.println(newNode.data + " "+ newNode.next);
	   /* 3. Make next of new Node as head */
  
	   newNode.next=head;
	   
	   /* 4. Move the head to point to new Node */
	   
	   head=newNode;
	   printList();
	  
   }
   
   /* Appends a new node at the end.  This method is  
   defined inside LinkedList class shown above */
   public void addElementAtTheEnd(int dataEnd)
   {
	   /* 1. Allocate the Node & 
       2. Put in the data 
       3. Set next as null */
	   
	   Node newNodeEnd=new  Node(dataEnd);
	  
	   /* 4. If the Linked List is empty, then make the 
       new node as head */
	   if(head==null)
	   {
		   head=new Node(dataEnd);
		   return;
	   }
	   /* 4. This new node is going to be the last node, so 
       make next of it as null */
	   newNodeEnd.next = null; 
	   /* 5. Else traverse till the last node */
	   Node last=head;
	   while(last.next!=null)
	   {
		 last=last.next;  
	   }
	   /* 6. Change the next of last node */
	   last.next=newNodeEnd;
   }
   
   public void printList()
   {
	   Node element=head;
	   while(element!=null)
	   {
		   System.out.print(element.data +" ");
		   element=element.next;
	   }
   }
   

}
