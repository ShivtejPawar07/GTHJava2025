/*Q35. Write a java program to find the frequency of each digit in a given integer.
*/
import java.util.*;

class Freq {
  public static void main(String x[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();
    int d = 0;

    while (d <= 9) {
      int temp = n;
      int count = 0;

      while (temp != 0) {
        int rem = temp % 10;
        if (rem == d) {
          count++;
        }
        temp = temp / 10;
      }
        
      if (count > 0) {
        System.out.println("Digit " + d + " occurs " + count + " times");
      }

      d++;
    }
  }
}
