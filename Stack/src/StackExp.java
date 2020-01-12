import java.util.Stack;
// stack is LIFO

// https://www.geeksforgeeks.org/stack-class-in-java/
// java code for stack implementation
public class StackExp {
	
	// pushing elements on the top of the stack
	static void stackPush(Stack<Integer> stack)
	{
		for(int i=0;i<5;i++)
		{
			stack.push(i*5);
		}
		System.out.println("Printing the stack value which is push:");
		System.out.println("Push :"+stack +"\nsize of stack: "+ stack.size());
	}
	// Displaying the elements on the top of the stack
	static void stack_peek(Stack<Integer> stack)
	{
		Integer element=stack.peek();
		System.out.println("Element on stack top :" + element);
	}
	
  // Popping elements from the top of the stack
	static void stack_pop(Stack<Integer> stack)
	{
		
		System.out.print("Pop : ");
		for(int i=0;i<5;i++)
		{
			Integer dataElement=(Integer)stack.pop();
			System.out.print(" "+ dataElement);
			
		}
		System.out.println();
	}
	// searching Elements in the stack
	static void stack_search(Stack<Integer> stack,int element)
	{
		Integer positionOfStackElements=(Integer) stack.search(element);
		if(positionOfStackElements==-1)
			System.out.println("Element not found");
		else System.out.println("Element is found at position :"+ positionOfStackElements);
		
	}
	public static void main(String[] args) 
	{
		StackExp stackEmp=new StackExp();
		Stack<Integer> stack=new Stack<Integer>();
		stackEmp.stackPush(stack);
		stackEmp.stack_peek(stack);
		stackEmp.stack_search(stack, 10);
		stackEmp.stack_pop(stack);
		
		stackEmp.stack_search(stack, 4);
	}

}
