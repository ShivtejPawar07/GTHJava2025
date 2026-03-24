/*
Q10. Write a Java program to check whether a square matrix is a Magic Square. 
Description: 
A matrix is called a Magic Square if: 
• Sum of all rows is equal 
• Sum of all columns is equal 
• Both diagonals also have the same sum */
import java.util.*;

class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Step 1: Find sum of first row (reference sum)
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += a[0][j];
        }

        // Step 2: Check all rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += a[i][j];
            }
            if (rowSum != magicSum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        // Step 3: Check all columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += a[i][j];
            }
            if (colSum != magicSum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        // Step 4: Main diagonal
        int d1 = 0;
        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
        }
        if (d1 != magicSum) {
            System.out.println("Not a Magic Square");
            return;
        }

        // Step 5: Second diagonal
        int d2 = 0;
        for (int i = 0; i < n; i++) {
            d2 += a[i][n - 1 - i];
        }
        if (d2 != magicSum) {
            System.out.println("Not a Magic Square");
            return;
        }

        // If all conditions true
        System.out.println("It is a Magic Square!");
    }
}
/*8   1   6
3   5   7
4   9   2
✔ Why is it a Magic Square?
Each row sums to 15

8 + 1 + 6 = 15

3 + 5 + 7 = 15

4 + 9 + 2 = 15

Each column sums to 15

8 + 3 + 4 = 15

1 + 5 + 9 = 15

6 + 7 + 2 = 15

Both diagonals also sum to 15

8 + 5 + 2 = 15

6 + 5 + 4 = 15

Another Example (4×4 Magic Square)
Copy code
16   2   3   13
5    11  10   8
9    7    6   12
4    14  15   1
Magic constant here = 34*/
