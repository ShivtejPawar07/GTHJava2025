/*Q5. Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence
You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent 
class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have to create one more class name ReverseArray and override 
arrangeSeq() method from ArrParent and reverse array and display it.

*/
import java.util.*;

class ArrParent {
    int[] arr;

    void setValue(int arr[]) {
        this.arr = arr;
    }

    void arrangeSeq() {
        System.out.println("Parent arrangeSeq() method — will be overridden by child classes.");
    }
}

class ArrangeAscendingOrder extends ArrParent {
    @Override
    void arrangeSeq() {
        Arrays.sort(arr); // sort array in ascending order
        System.out.println("Array in Ascending Order:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

class ReverseArray extends ArrParent {
    @Override
    void arrangeSeq() {
        System.out.println("Array in Reverse Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class ArrApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Ascending Order
        ArrangeAscendingOrder asc = new ArrangeAscendingOrder();
        asc.setValue(a);
        asc.arrangeSeq();

        // Reverse Order
        ReverseArray rev = new ReverseArray();
        rev.setValue(a);
        rev.arrangeSeq();
    }
}

