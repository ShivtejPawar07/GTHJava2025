/* **10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.*/
import java.util.*;

class Student {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int count = 0;
        String input;

        do {
            System.out.println("Enter marks (or type 'stop' to finish):");
            input = sc.next();

            // Stop condition
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            int marks = Integer.parseInt(input);

            if (marks < 0) {
                System.out.println("Invalid marks! Must be positive.");
                continue;
            }

            totalMarks += marks;
            count++;

        } while (true);

        if (count > 0) {
            double avg = (double) totalMarks / count;
            System.out.println("Average marks = " + avg);
        } else {
            System.out.println("No valid marks entered.");
        }
    }
}
