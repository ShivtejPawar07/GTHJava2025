/*39Check whether a student is eligible for scholarship:
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.*/
import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input attendance percentage
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        // Input marks
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        // Check eligibility using if-else
        if (attendance >= 75 && marks >= 80) {
            System.out.println("Eligible for Scholarship.");
        } else {
            System.out.println("Not Eligible for Scholarship.");
        }

    }
}
