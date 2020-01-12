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
		System.out.println(stack);
	}
	// Displaying the elements on the top of the stack
	static void stack_peek(Stack<Integer> stack)
	{
		Integer element=stack.peek();
		System.out.print("Element on stack top :" + element);
	}
	
  // poping elements from the top of the stack
	static void stack_pop(Stack<Integer> stack)
	{
		
	}
	public static void main(String[] args) 
	{
		StackExp stackEmp=new StackExp();
		Stack<Integer> stack=new Stack<Integer>();
		stackEmp.stackPush(stack);
		stackEmp.stack_peek(stack);
	}

}
