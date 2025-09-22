/* Q4. Find First Negative Number in Every Window of Size K */
import java.util.*;

class Array {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        // Loop for each window
        for (int i = 0; i <= a.length - k; i++) {
            boolean flag = false;

            // Check the current window of size k
            for (int j = i; j < i + k; j++) {
                if (a[j] < 0) {
                    System.out.println("First negative in window " + (i + 1) + " : " + a[j]);
                    flag = true;
                    break; // stop at the first negative
                }
            }

            if (!flag) {
                System.out.println("First negative in window " + (i + 1) + " : Not found");
            }
        }
    }
}
