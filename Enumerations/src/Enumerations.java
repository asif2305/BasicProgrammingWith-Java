// A simple enum example where enum is declared outside any class
//Enum declaration can be done outside a Class or inside a Class but not inside a Method. 

enum ColorCheck
{
	RED,GREEN,BLUE,WHITE,BLACK;
}
enum Season
{
	WINTER(10),SPRING(20),SUMMER(30),FALL(40);
	public int value;
	private Season(int value)
	{
		this.value=value;
	}
}

public class Enumerations {

	// Drive Method
	public static void main(String[] args) {
		ColorCheck color=ColorCheck.BLUE;
		System.out.println(color);
		
		
	   for(Season s: Season.values())
	   {
		   System.out.println(s + " " + s.value);
	   }

	}

}
