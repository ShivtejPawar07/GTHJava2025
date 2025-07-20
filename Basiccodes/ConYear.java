/* Q18. Write a Java program to convert days to years, month and week.
   365 days = 1 year
   1 weeks=7 days
*/
public class ConYear {
    public static void main(String[] x) {
        int totalDays = Integer.parseInt(x[0]); //404
        int years = totalDays / 365; //404/365=1
        int day = totalDays % 365; //404%365=39
         
		int month=day/30;//39/30=1
		int days=day%30;//39%30=9
		
        int week = days/7;//9/7=1
		int dayss=days%7;//9%7=2

      System.out.println("Total Days: " + totalDays);
      System.out.println("Years: " + years);
	  System.out.println("Months: " + month);
      System.out.println("Weeks: " + week);
      System.out.println("Days: " + dayss);
    }
}
