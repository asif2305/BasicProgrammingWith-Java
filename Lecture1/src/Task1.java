
/*
Implement a static method in Java for the following operation:
– Input: 2-dimensional array with int values
– Output: An int value, representing the sum of the largest values of all columns
*/


public class Task1 
{
	public static int[][] twoDArray= new int[2][4];
	public static int sumOfTheLargestNumbers=0; 
	public static void sumOfLargestValues(int [][] twoDArray )
	    {
	    	for(int i=0;i<twoDArray.length-1;i++) // length will be 2-1
	  	   {
	  		   for(int j=1,k=0;k<twoDArray[0].length;k++) // length will be 4a
	  		   {
	  			   if(twoDArray[i][k]> twoDArray[j][k])
	  			   {
	  				   sumOfTheLargestNumbers= sumOfTheLargestNumbers+twoDArray[i][k];
	  			   }
	  			   else
	  				   sumOfTheLargestNumbers= sumOfTheLargestNumbers+twoDArray[j][k];
	  				   
	  		   }
	  	   }
	    	 // output the largest values
	  	   System.out.println(sumOfTheLargestNumbers);
	    }
    public static void main(String[] args)
    {
    	   // Assign the value for the array
    	   twoDArray[0][0]=5;
    	   twoDArray[0][1]=2;
    	   twoDArray[0][2]=7;
    	   twoDArray[0][3]=8;
    	   twoDArray[1][0]=3;
    	   twoDArray[1][1]=3;
    	   twoDArray[1][2]=5;
    	   twoDArray[1][3]=4;
    	    // function calling
    	   sumOfLargestValues(twoDArray);
    	  
    	   
    	   
    }
   
   
}
