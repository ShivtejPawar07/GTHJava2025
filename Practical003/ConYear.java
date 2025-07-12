/* Convert days into years, weeks, and days
   365 days = 1 year
*/

public class ConYear {
    public static void main(String[] x) {
        int totalDays = Integer.parseInt(x[0]); //404
        int years = totalDays / 365; //404/365=1
        int days = totalDays % 365; //404%365=39

        int weeks = days / 7; //39/7=5
        int dayss = days % 7;//4

        System.out.println("Total Days: " + totalDays);
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + dayss);
    }
}
