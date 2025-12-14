/*Q47. Write a Java program to print all Pronic numbers between 1 and n.
A Pronic number is the product of two consecutive integers, i.e., n(n+1).
Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.

Explanation:
 Use a loop to check for each number from 1 to n. For each, use another loop 
 to find if it can be expressed as x*(x+1).*/
 import java.util.*;

class Pronic {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for (int i = 1; i * (i + 1) <= n; i++) {
           
            System.out.print("("+i+"*"+"("+(i+1)+"))="+i * (i + 1) + " ");
        }
	} 
}