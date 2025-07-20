/*Q38. Check whether the month number is valid and display season.

 

    Input: 1 to 12

    Logic: if-else if to map to Winter/Spring/Summer/Autumn.

    Output: Season.*/
import java.util.Scanner;

class MonthSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Season: Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Season: Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Season: Summer");
        } else {
            System.out.println("Season: Autumn");
        }
     
    }
}
