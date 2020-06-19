import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
		int number=3;
		// here alist is an ArrayList of ArrayList
		ArrayList<ArrayList<Integer> > aList =  
                new ArrayList<ArrayList<Integer> >(number); 
		// create a number of list and append with each other
		// master list
		ArrayList<Integer> arraylist1= new  ArrayList<Integer>();
		arraylist1.add(1);arraylist1.add(2);
		aList.add(arraylist1);
		
		ArrayList<Integer> arraylist2= new  ArrayList<Integer>();
		arraylist2.add(6);arraylist2.add(7);arraylist2.add(65);
		aList.add(arraylist2);
		
		ArrayList<Integer> arraylist3= new  ArrayList<Integer>();
		arraylist3.add(201);arraylist3.add(20);
		aList.add(arraylist3);
		
		// display data using forloop
		for(int i=0;i<aList.size();i++)
		{
			for(int j=0;j<aList.get(i).size();j++)
			{
				System.out.print(aList.get(i).get(j) + " ");
			}
			System.out.println();
		}
        

	}

}
