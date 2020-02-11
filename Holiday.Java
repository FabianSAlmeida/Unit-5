public class Holiday {
		//Given Code
		private String name;
		private int day;
		private String month;

		//Creating Constructors to hold data
	public Holiday(String holidayName, int holidayDate, String holidayMonth) {
		name = holidayName;
		day = holidayDate;
		month = holidayMonth;
		}
		
	//Method used to return true/false if the months are the same
	public boolean inSameMonth(Holiday hol){
		 return this.month.equals(hol.month);
		}
	
	//Method used to shows what the length of the holiday is
	public static double avgDate(Holiday[] hol) {
		 int total = 0;
		 for(int H = 0; H < hol.length; H++) {
		 total = total + hol[H].day;
		 }
		 return ((double) total)/hol.length;
	}
	
	//Code that Independence Day as the holiday, 4 as the day, and July as the month 
	Holiday hol = new Holiday("Independence Day", 4, "July");
}
