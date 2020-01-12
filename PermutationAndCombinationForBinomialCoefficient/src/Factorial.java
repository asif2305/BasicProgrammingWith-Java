// Java program to find factorial of given number 
// n!=n*(n-1)
public class Factorial {
  
	
	static int factorialNumber(int number)
	{
		// single line to find factorial
		return(number==1 || number==0) ? 1: number*factorialNumber(number-1);
	}
}
