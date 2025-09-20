/*Q1 Q1. Task: For a number n, calculate: 
   Sum of digits at even places (from right) 
   Sum of digits at odd places (from right) 
   Finally print the difference of these sums. 
   Example: n = 572631 → even places sum = 7+6+1 = 14,  
odd places sum = 5+2+3 = 10 → difference = 4.*/
import java.util.*;
class SApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int temp = n; // e.g. 572631
        int cnt = 0;

        // count digits
        while (temp != 0) {
            temp /= 10;
            cnt++;
        }

        int Esum=0, Osum=0;

        // i = position from right
        for (int i=1; i<=cnt;i++) {
            int rem=n%10; // get last digit

            if (i%2==0) {
                // even position
                Esum += rem;
            } else {
                // odd position
                Osum += rem;
            }
            n=n/10;
        }
        System.out.println("Sum of digits at odd places = " + Osum);
        System.out.println("Sum of digits at even places = " + Esum);
        System.out.println("Difference = " + Math.abs(Esum - Osum));
    }
}
