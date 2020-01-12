import java.util.Scanner;

public class BinomialCoefficiant {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); // to take user input
		Factorial objFactorial=new Factorial();// object initialisation
		int number=input.nextInt();// for factorial result
        System.out.println("Factorial of "+ number +" is : " + Factorial.factorialNumber((number)));
        
        // for permutation
        Permutation objPermutation= new Permutation();
        int resultForPermutation;
        int FirstNumber=input.nextInt(); // n
        int SecondNumber=input.nextInt(); // r
        resultForPermutation=objPermutation.permutationOfNumber(FirstNumber)
        		            /objPermutation.permutationOfNumber(FirstNumber-SecondNumber); // object initialisation
                
        System.out.println("Permutation of "+ FirstNumber +"  and "+ SecondNumber +" is : " +resultForPermutation);
        
        
        // for Combination
        Combination objCombination= new Combination();
        int resultForCombination;
       
        resultForCombination=objCombination.combinationOfNumber(FirstNumber)
        		            /((objCombination.combinationOfNumber(SecondNumber))
        		            *objCombination.combinationOfNumber(FirstNumber-SecondNumber)); // object initialisation
                
        System.out.println("Combination of "+ FirstNumber +"  and "+ SecondNumber +" is : " +resultForCombination);
	}

}
