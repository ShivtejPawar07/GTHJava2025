/*Tribonacci sequence
0, 1, 1, 2, 4, 7, 13, 24, 44, ...

*/
import java.util.*;
class Solution {
    public static int tribo(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        // Recursive formula
        return tribo(n-1) + tribo(n-2) + tribo(n-3);
    }
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number in Fibonacci Series");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) //0 1 1 2 3 5
		System.out.print(tribo(i)+" "); //
	}
}
