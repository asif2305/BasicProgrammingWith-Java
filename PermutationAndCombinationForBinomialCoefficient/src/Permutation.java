
// Permutation = factorial(n) / factorial(n-r);
public class Permutation
{
  public  static int permutationOfNumber(int value)
   {
	   int factorial=1;
	   int initialNumber=1;
	   while(initialNumber<=value)
	   {
		   factorial=factorial*initialNumber;
		   initialNumber++;
	   }
	   return factorial;
			   
   }
}
