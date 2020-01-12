import java.util.*;
public class LinkedListExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList<String> object = new LinkedList<String>(); 
		 
		 // Adding the elements to the linked list
		 
		 object.add("A");
		 object.add("B");
		 object.add("C");
		 object.addFirst("D");
		 object.addLast("R");
		 object.add(2,"E");
		 object.add("F");
		 object.add("G");
		 
		 System.out.println("Linked List: " + object);
		 System.out.println("element(): " + object.element());
		 System.out.println("GetIndex: " + object.get(1));
		 System.out.println("getFirst(): " + object.getFirst());
		 System.out.println("getLast(): " + object.getLast());
		 System.out.println("hashCode(): " + object.hashCode());
		 System.out.println("indexOf(): " + object.indexOf("B"));
		 System.out.println("lastIndexOf: " + object.lastIndexOf("F"));
		 System.out.println("peek: " + object.peek()); // first elements of list
		 System.out.println("peekFirst: " + object.peekFirst()); // first elements of list
		 System.out.println("peekLast: " + object.peekLast()); // first elements of list
		 System.out.println("removeFirst: " + object.removeFirst()); // removeFirst
		 System.out.println("removeLast: " + object.removeLast()); // removeLast
		 
		 // Get and set elements from linked list
		 
		 Object element=object.get(2);
		 System.out.println("Elements return by get: " + element);  
		 System.out.println("object list: " + object);  
		 // set elements into list
		 object.set(3, "GA");
		 System.out.println("object list after change: " + object);  
		 
	}

}
