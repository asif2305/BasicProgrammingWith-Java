package MyPackage;

public class EnumCalling {

	public static void main(String[] args) {
		   System.out.println("main() begins...");
		   DayofWeeks dayOfWeeksMonday=DayofWeeks.Monday;
		   DayofWeeks dayOfWeeksTuesday=DayofWeeks.Tuesday;
		   DayofWeeks dayOfWeeksWednesday=DayofWeeks.Wednesday;
		   
		   DayofWeeks dayOfWeeksSunday=DayofWeeks.Sunday;

		   System.out.print(dayOfWeeksMonday + " : ");
		   System.out.print(dayOfWeeksMonday.startTime + ": AND "); System.out.println(dayOfWeeksMonday.endTime);
		   System.out.print(dayOfWeeksTuesday + " : "); 
		   System.out.print(dayOfWeeksTuesday.startTime + ": AND "); System.out.println(dayOfWeeksTuesday.endTime);
		   System.out.print(dayOfWeeksWednesday + " : "); 
		   System.out.print(dayOfWeeksWednesday.startTime + ": AND "); System.out.println(dayOfWeeksWednesday.endTime);
		   System.out.print(dayOfWeeksSunday + " : "); 
		   System.out.print(dayOfWeeksSunday.startTime + ": AND "); System.out.println(dayOfWeeksSunday.endTime);
		   
		

	}

}
