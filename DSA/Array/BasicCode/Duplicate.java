/*Duplicate*/
import java.util.*;
public class FPAPP {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter values in array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("\nArray values:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d\t", a[i]);
        }

        // find duplicate pairs
        boolean flag = false;
        System.out.println("\n\nDuplicate pairs:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    System.out.printf("(%d,%d)\n", a[i], a[j]);
                }
            }
        }

        if (flag) {
            System.out.println("\nDuplicate(s) found.");
        } else {
            System.out.println("\nNo duplicates.");
        }
    }
}
