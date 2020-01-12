package MyPackage;

public enum DayofWeeks {
  
	   // Constant(value associated)
		 Monday("Flight start:10 AM","Flight End:10 PM"),
		 Tuesday("Flight start:12 AM","Flight End:2 PM"),
		 Wednesday("Flight start:1 AM","Flight End:5 PM"),
		 Thursday("Flight start:10 AM","Flight End:11 PM"),
		 Friday("Flight start:10 AM","Flight End:8 PM"),
		 Saturday("Flight start:8 AM","Flight End:7 PM"),
		 Sunday("Flight start:5 AM","Flight End:6 PM");
	
	    public String startTime,endTime;
	
	 // Constant
	    private DayofWeeks(String START,String END)
	    {
	    	 System.out.println("Enum's constructor");
	    	 this.startTime=START;
	    	 this.endTime=END;
	    }

}
