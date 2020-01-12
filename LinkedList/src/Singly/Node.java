package Singly;

public class Node {
   public int data;
   public Node next;
   
   Node(int data)
   {
	   this.data=data;
	   next=null;
   }
   public void displayNodeData()
   {
	   System.out.println("{ " + data + "} " );
	   
   }
}
