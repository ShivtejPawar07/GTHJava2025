/*UniqueArray*/
import java.util.*;

class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        int arr[] = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};

        System.out.println("Input array elements:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("All unique elements in the array are: ");

        // Find unique numbers
       /* for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {   // element appears only once
                System.out.print(arr[i] + " ");
            }
        }
 */
    }
}