import java.util.*;
public class Seclarge {
    public static void main(String x[]) {
        int a[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSecond maximum element from each column:");
        for (int col = 0; col < 3; col++) {
            int colArr[] = new int[3];
            for (int row = 0; row < 3; row++) {
                colArr[row] = a[row][col]; // take column elements
            }
            Arrays.sort(colArr); // sort column
            System.out.println("Column " + (col + 1) + " → " + colArr[1]); // 2nd largest (middle element)
        }
    }
}
