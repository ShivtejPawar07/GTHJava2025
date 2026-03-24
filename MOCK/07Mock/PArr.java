/*Q3. Write a java program to take input array from user and perform operations in array. 
  Store only prime number at the same index of digit. 
   Input :-  5732  8659  2534  9625  7354  1325 
    Output :- 2573  5  253  25  357  235*/
	
import java.util.*;

class PArr {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];   // size 6 because 6 inputs given

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Output:");

        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int result = 0;
            int place = 1;

            // Reverse number first to maintain original order
            int rev = 0;
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            // Check each digit of reversed number
            while (rev != 0) {
                int rem = rev % 10;

                if (isPrime(rem)) {
                    result = result * 10 + rem;
                }

                rev /= 10;
            }

            System.out.print(result + " ");
        }
    }

    // Prime check method
    static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}