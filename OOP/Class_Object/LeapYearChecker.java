/* 
18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check 
if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/

import java.util.*;
class LeapYearChecker {
    // Method to check leap year
    public boolean isLeapYear(int year) {
        // A year is a leap year if:
        // 1. It is divisible by 400, OR
        // 2. It is divisible by 4 but not divisible by 100
        if ((year%400==0) || (year%4==0 && year%100!=0)) {
            return true;
        } else {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYearChecker checker = new LeapYearChecker();

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (checker.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
