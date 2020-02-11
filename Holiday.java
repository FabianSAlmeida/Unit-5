public class Holiday {
		//Given Code
		private String name;
		private int day;
		private String month;

		//Creating Constructors
	public Holiday(String n, int d, String m) {
		name = n;
		day = d;
		month = m;
		}
		
	//Method used to return true/false if the months are the same
	public boolean inSameMonth(Holiday hol){
		 return this.month.equals(hol.month);
		}
	
	//Method used to shows what the length of the holiday is
	public static double avgDate(Holiday[] hol) {
		 int sum = 0;
		 for(int i = 0; i < hol.length; i++) {
		 sum = sum + hol[i].day;
		 }
		 return ((double) sum)/hol.length;
	}
	
	//piece of code that Independence Day as the holiday, 4 as the day, and July as the month 
	Holiday hol = new Holiday("Independence Day", 4, "July");
}
